enum util'boolean {
	util'boolean'true, util'boolean'false
}
one sig util'language {
	AsDeclaration'pattern'queries'child : type'EClass'class->type'EClass'class,
	util'root : one type'ENamedElement'class + (type'EPackage'class + (type'ETypedElement'class + (type'EEnum'class + (type'EClassifier'class + (type'EStructuralFeature'class + (type'EAttribute'class + (type'EReference'class + (type'EClass'class + (type'EEnumLiteral'class + type'EDataType'class))))))))),
	util'contains : (type'ENamedElement'class + (type'EPackage'class + (type'ETypedElement'class + (type'EEnum'class + (type'EClassifier'class + (type'EStructuralFeature'class + (type'EAttribute'class + (type'EReference'class + (type'EClass'class + (type'EEnumLiteral'class + type'EDataType'class)))))))))) lone->set (type'ENamedElement'class + (type'EPackage'class + (type'ETypedElement'class + (type'EEnum'class + (type'EClassifier'class + (type'EStructuralFeature'class + (type'EAttribute'class + (type'EReference'class + (type'EClass'class + (type'EEnumLiteral'class + type'EDataType'class))))))))))
}
abstract sig util'Object {
}
abstract sig type'ENamedElement'class extends util'Object {
}
abstract sig type'EClassifier'class extends type'ENamedElement'class {
	ePackage'reference'EClassifier : lone type'EPackage'class
}
sig type'EClass'class extends type'EClassifier'class {
	eStructuralFeatures'reference'EClass : set type'EStructuralFeature'class,
	eSuperTypes'reference'EClass : set type'EClass'class,
	abstract'attribute'EClass : lone util'boolean
}
abstract sig type'ETypedElement'class extends type'ENamedElement'class {
	eType'reference'ETypedElement : lone type'EClassifier'class,
	lowerBound'attribute'ETypedElement : lone Int,
	upperBound'attribute'ETypedElement : lone Int
}
abstract sig type'EStructuralFeature'class extends type'ETypedElement'class {
	eContainingClass'reference'EStructuralFeature : lone type'EClass'class
}
sig type'EReference'class extends type'EStructuralFeature'class {
	eOpposite'reference'EReference : lone type'EReference'class,
	containment'attribute'EReference : lone util'boolean
}
sig type'EAttribute'class extends type'EStructuralFeature'class {
}
sig type'EPackage'class extends type'ENamedElement'class {
	eClassifiers'reference'EPackage : set type'EClassifier'class
}
sig type'EDataType'class extends type'EClassifier'class {
}
sig type'EEnum'class extends type'EDataType'class {
	eLiterals'reference'EEnum : set type'EEnumLiteral'class
}
sig type'EEnumLiteral'class extends type'ENamedElement'class {
	eEnum'reference'EEnumLiteral : lone type'EEnum'class
}
pred pattern'queries'attributeHasType [parameter'a: type'EAttribute'class, parameter'd: type'EDataType'class] {
	parameter'd in type'EDataType'class and (parameter'a in type'EAttribute'class and parameter'd in parameter'a.eType'reference'ETypedElement)
}
pred pattern'queries'attributeHasNotTypeConstraint [parameter'a: type'EAttribute'class] {
	all variable'0: type'EDataType'class { parameter'a in type'EAttribute'class and ! (pattern'queries'attributeHasType [ parameter'a , variable'0 ]) }
}
pred pattern'queries'child [parameter'c1: type'EClass'class, parameter'c2: type'EClass'class] {
	parameter'c2 in parameter'c1.eSuperTypes'reference'EClass and parameter'c2 in type'EClass'class
}
pred pattern'queries'noCycles [parameter'c: type'EClass'class] {
	parameter'c->parameter'c in ^ (util'language.AsDeclaration'pattern'queries'child)
}
pred pattern'queries'referenceHasType [parameter'r: type'EReference'class, parameter'c: type'EClass'class] {
	parameter'c in type'EClass'class and (parameter'r in type'EReference'class and parameter'c in parameter'r.eType'reference'ETypedElement)
}
pred pattern'queries'classHasReference [parameter'r: type'EReference'class, parameter'c: type'EClass'class] {
	parameter'r in type'EReference'class and parameter'r in parameter'c.eStructuralFeatures'reference'EClass
}
pred pattern'queries'referenceHasNotTypeConstraint [parameter'r: type'EReference'class] {
	all variable'0: type'EClass'class { parameter'r in type'EReference'class and ! (pattern'queries'referenceHasType [ parameter'r , variable'0 ]) }
}
pred pattern'queries'oppositeOfitself [parameter'r: type'EReference'class] {
	parameter'r in parameter'r.eOpposite'reference'EReference
}
pred pattern'queries'isOpposite [parameter'r: type'EReference'class, parameter'rr: type'EReference'class] {
	parameter'rr in parameter'r.eOpposite'reference'EReference and parameter'rr in type'EReference'class
}
pred pattern'queries'oppositeRestriction [parameter'r: type'EReference'class, parameter'rr: type'EReference'class] {
	parameter'rr in parameter'r.eOpposite'reference'EReference and (parameter'rr in type'EReference'class and ! (pattern'queries'isOpposite [ parameter'rr , parameter'r ]))
}
pred pattern'queries'oppositeRestrictionSameClasses [parameter'r: type'EReference'class] {
	some variable'rr: type'EReference'class, variable'c1: type'EClassifier'class, variable'c4: type'EClass'class { variable'rr in parameter'r.eOpposite'reference'EReference and (variable'rr in type'EReference'class and (variable'c1 in parameter'r.eType'reference'ETypedElement and (variable'c1 in type'EClassifier'class and (variable'rr in variable'c4.eStructuralFeatures'reference'EClass and variable'c1 != variable'c4)))) }
}
fact EqualsAsDeclaration'pattern'queries'child {
	all a: type'EClass'class, b: type'EClass'class { pattern'queries'child [ a , b ] iff a->b in util'language.AsDeclaration'pattern'queries'child }
}
fact util'containmentDefinition {
	util'language.util'contains = eStructuralFeatures'reference'EClass + (eClassifiers'reference'EPackage + eLiterals'reference'EEnum)
}
fact util'noParentForRoot {
	no parent: type'ENamedElement'class + (type'EPackage'class + (type'ETypedElement'class + (type'EEnum'class + (type'EClassifier'class + (type'EStructuralFeature'class + (type'EAttribute'class + (type'EReference'class + (type'EClass'class + (type'EEnumLiteral'class + type'EDataType'class))))))))) { parent->(util'language.util'root) in util'language.util'contains }
}
fact util'atLeastOneParent {
	all child: type'ENamedElement'class + (type'EPackage'class + (type'ETypedElement'class + (type'EEnum'class + (type'EClassifier'class + (type'EStructuralFeature'class + (type'EAttribute'class + (type'EReference'class + (type'EClass'class + (type'EEnumLiteral'class + type'EDataType'class))))))))) { child = util'language.util'root or (some parent: type'ENamedElement'class + (type'EPackage'class + (type'ETypedElement'class + (type'EEnum'class + (type'EClassifier'class + (type'EStructuralFeature'class + (type'EAttribute'class + (type'EReference'class + (type'EClass'class + (type'EEnumLiteral'class + type'EDataType'class))))))))) { parent->child in util'language.util'contains }) }
}
fact util'noCircularContainment {
	no circle: type'ENamedElement'class + (type'EPackage'class + (type'ETypedElement'class + (type'EEnum'class + (type'EClassifier'class + (type'EStructuralFeature'class + (type'EAttribute'class + (type'EReference'class + (type'EClass'class + (type'EEnumLiteral'class + type'EDataType'class))))))))) { circle->circle in ^ (util'language.util'contains) }
}
fact oppositeReference'ePackage'EClassifier {
	ePackage'reference'EClassifier = ~ eClassifiers'reference'EPackage
}
fact oppositeReference'eStructuralFeatures'EClass {
	eStructuralFeatures'reference'EClass = ~ eContainingClass'reference'EStructuralFeature
}
fact oppositeReference'eLiterals'EEnum {
	eLiterals'reference'EEnum = ~ eEnum'reference'EEnumLiteral
}
fact errorpattern'queries'attributeHasNotTypeConstraint {
	all p0: type'EAttribute'class { ! (pattern'queries'attributeHasNotTypeConstraint [ p0 ]) }
}
fact errorpattern'queries'noCycles {
	all p0: type'EClass'class { ! (pattern'queries'noCycles [ p0 ]) }
}
fact errorpattern'queries'referenceHasNotTypeConstraint {
	all p0: type'EReference'class { ! (pattern'queries'referenceHasNotTypeConstraint [ p0 ]) }
}
fact errorpattern'queries'oppositeOfitself {
	all p0: type'EReference'class { ! (pattern'queries'oppositeOfitself [ p0 ]) }
}
fact errorpattern'queries'oppositeRestriction {
	all p0: type'EReference'class, p1: type'EReference'class { ! (pattern'queries'oppositeRestriction [ p0 , p1 ]) }
}
fact errorpattern'queries'oppositeRestrictionSameClasses {
	all p0: type'EReference'class { ! (pattern'queries'oppositeRestrictionSameClasses [ p0 ]) }
}
fact UpperMultiplicity'EPackage'class'1 {
	# type'EPackage'class <= 1
}
fact LowerMultiplicity'EPackage'class'1 {
	# type'EPackage'class >= 1
}
run { } for exactly 5 util'Object , 2 Int , exactly 0 String