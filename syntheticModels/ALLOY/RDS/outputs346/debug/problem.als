one sig util'language {
	util'root : one type'Column'class + (type'Index'class + (type'Element'class + (type'Reference'class + (type'IndexColumn'class + (type'Table'class + type'Database'class))))),
	util'contains : (type'Column'class + (type'Index'class + (type'Element'class + (type'Reference'class + (type'IndexColumn'class + (type'Table'class + type'Database'class)))))) lone->set (type'Column'class + (type'Index'class + (type'Element'class + (type'Reference'class + (type'IndexColumn'class + (type'Table'class + type'Database'class))))))
}
abstract sig util'Object {
}
sig type'Database'class extends util'Object {
	elements'reference'Database : set type'Element'class
}
abstract sig type'Element'class extends util'Object {
}
sig type'Column'class extends util'Object {
	foreignReferences'reference'Column : set type'Reference'class,
	primaryReferences'reference'Column : set type'Reference'class
}
sig type'Table'class extends type'Element'class {
	columns'reference'Table : set type'Column'class,
	indexes'reference'Table : set type'Index'class
}
sig type'Reference'class extends type'Element'class {
	foreignKeyColumns'reference'Reference : one type'Column'class,
	primaryKeyColumns'reference'Reference : one type'Column'class
}
sig type'Index'class extends util'Object {
	indexColumns'reference'Index : set type'IndexColumn'class
}
sig type'IndexColumn'class extends util'Object {
	column'reference'IndexColumn : lone type'Column'class
}
pred pattern'queries'ref2thesame [parameter'r: type'Reference'class, parameter'c1: type'Column'class, parameter'c2: type'Column'class] {
	parameter'c2 in parameter'r.foreignKeyColumns'reference'Reference && (parameter'c2 in parameter'r.primaryKeyColumns'reference'Reference && parameter'c2 in type'Column'class)
}
pred pattern'queries'equalRefs [parameter'r1: type'Reference'class, parameter'r2: type'Reference'class, parameter'c1: type'Column'class, parameter'c2: type'Column'class] {
	parameter'c1 in parameter'r1.foreignKeyColumns'reference'Reference && (parameter'c1 in parameter'r2.foreignKeyColumns'reference'Reference && (parameter'c1 in type'Column'class && (parameter'c2 in parameter'r1.primaryKeyColumns'reference'Reference && (parameter'c2 in parameter'r2.primaryKeyColumns'reference'Reference && (parameter'c2 in type'Column'class && parameter'r1 != parameter'r2)))))
}
pred pattern'queries'columnInTable [parameter't: type'Table'class, parameter'c: type'Column'class] {
	parameter'c in parameter't.columns'reference'Table && parameter'c in type'Column'class
}
pred pattern'queries'icCons [parameter'ic: type'IndexColumn'class, parameter't: type'Table'class, parameter'i: type'Index'class, parameter'c: type'Column'class] {
	parameter'i in parameter't.indexes'reference'Table && (parameter'ic in parameter'i.indexColumns'reference'Index && (parameter'c in parameter'ic.column'reference'IndexColumn && (parameter'c in type'Column'class && ! (pattern'queries'columnInTable [ parameter't , parameter'c ]))))
}
fact util'containmentDefinition {
	util'language.util'contains = elements'reference'Database + (columns'reference'Table + (indexes'reference'Table + indexColumns'reference'Index))
}
fact util'noParentForRoot {
	no parent: type'Column'class + (type'Index'class + (type'Element'class + (type'Reference'class + (type'IndexColumn'class + (type'Table'class + type'Database'class))))) { parent->(util'language.util'root) in util'language.util'contains }
}
fact util'atLeastOneParent {
	all child: type'Column'class + (type'Index'class + (type'Element'class + (type'Reference'class + (type'IndexColumn'class + (type'Table'class + type'Database'class))))) { child = util'language.util'root or (some parent: type'Column'class + (type'Index'class + (type'Element'class + (type'Reference'class + (type'IndexColumn'class + (type'Table'class + type'Database'class))))) { parent->child in util'language.util'contains }) }
}
fact util'noCircularContainment {
	no circle: type'Column'class + (type'Index'class + (type'Element'class + (type'Reference'class + (type'IndexColumn'class + (type'Table'class + type'Database'class))))) { circle->circle in ^ (util'language.util'contains) }
}
fact oppositeReference'foreignReferences'Column {
	foreignReferences'reference'Column = ~ foreignKeyColumns'reference'Reference
}
fact oppositeReference'primaryReferences'Column {
	primaryReferences'reference'Column = ~ primaryKeyColumns'reference'Reference
}
fact errorpattern'queries'ref2thesame {
	all p0: type'Reference'class, p1: type'Column'class, p2: type'Column'class { ! (pattern'queries'ref2thesame [ p0 , p1 , p2 ]) }
}
fact errorpattern'queries'equalRefs {
	all p0: type'Reference'class, p1: type'Reference'class, p2: type'Column'class, p3: type'Column'class { ! (pattern'queries'equalRefs [ p0 , p1 , p2 , p3 ]) }
}
fact errorpattern'queries'icCons {
	all p0: type'IndexColumn'class, p1: type'Table'class, p2: type'Index'class, p3: type'Column'class { ! (pattern'queries'icCons [ p0 , p1 , p2 , p3 ]) }
}
fact UpperMultiplicity'Database'class'1 {
	# type'Database'class <= 1
}
fact LowerMultiplicity'Database'class'1 {
	# type'Database'class >= 1
}
run { } for exactly 3 util'Object , 2 Int , exactly 0 String