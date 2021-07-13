one sig util'language {
	regions'reference'CompositeElement : (type'CompositeElement'class + type'State'class)->type'Region'class,
	util'root : one type'State'class + (type'Exit'class + (type'Statechart'class + (type'Region'class + (type'CompositeElement'class + (type'State'class + (type'RegularState'class + (type'State'class + (type'Choice'class + (type'Synchronization'class + (type'Pseudostate'class + (type'FinalState'class + (type'Transition'class + (type'Vertex'class + type'Entry'class))))))))))))),
	util'contains : (type'State'class + (type'Exit'class + (type'Statechart'class + (type'Region'class + (type'CompositeElement'class + (type'State'class + (type'RegularState'class + (type'State'class + (type'Choice'class + (type'Synchronization'class + (type'Pseudostate'class + (type'FinalState'class + (type'Transition'class + (type'Vertex'class + type'Entry'class)))))))))))))) lone->set (type'State'class + (type'Exit'class + (type'Statechart'class + (type'Region'class + (type'CompositeElement'class + (type'State'class + (type'RegularState'class + (type'State'class + (type'Choice'class + (type'Synchronization'class + (type'Pseudostate'class + (type'FinalState'class + (type'Transition'class + (type'Vertex'class + type'Entry'class))))))))))))))
}
abstract sig util'Object {
}
abstract sig type'Pseudostate'class extends type'Vertex'class {
}
abstract sig type'Vertex'class extends util'Object {
	incomingTransitions'reference'Vertex : set type'Transition'class,
	outgoingTransitions'reference'Vertex : set type'Transition'class
}
sig type'Transition'class extends util'Object {
	target'reference'Transition : one type'Vertex'class,
	source'reference'Transition : lone type'Vertex'class
}
sig type'Region'class extends util'Object {
	vertices'reference'Region : set type'Vertex'class
}
sig type'Statechart'class extends type'CompositeElement'class {
}
abstract sig type'CompositeElement'class extends util'Object {
}
sig type'Entry'class extends type'Pseudostate'class {
}
sig type'Synchronization'class extends type'Pseudostate'class {
}
abstract sig type'RegularState'class extends type'Vertex'class {
}
sig type'State'class extends type'RegularState'class {
}
sig type'Choice'class extends type'Pseudostate'class {
}
sig type'Exit'class extends type'Pseudostate'class {
}
sig type'FinalState'class extends type'RegularState'class {
}
pred pattern'queries'entryInRegion [parameter'r1: type'Region'class, parameter'e1: type'Entry'class] {
	parameter'e1 in type'Entry'class && parameter'e1 in parameter'r1.vertices'reference'Region
}
pred pattern'queries'noEntryInRegion [parameter'r1: type'Region'class] {
	all variable'0: type'Entry'class { parameter'r1 in type'Region'class && not (pattern'queries'entryInRegion [ parameter'r1 , variable'0 ]) }
}
pred pattern'queries'multipleEntryInRegion [parameter'r: type'Region'class] {
	some variable'e1: type'Entry'class, variable'e2: type'Entry'class { pattern'queries'entryInRegion [ parameter'r , variable'e1 ] && (pattern'queries'entryInRegion [ parameter'r , variable'e2 ] && variable'e1 != variable'e2) }
}
pred pattern'queries'transition [parameter't: type'Transition'class, parameter'src: type'Vertex'class, parameter'trg: type'Vertex'class] {
	parameter'src in parameter't.source'reference'Transition && (parameter'src in type'Vertex'class && (parameter'trg in parameter't.target'reference'Transition && parameter'trg in type'Vertex'class))
}
pred pattern'queries'incomingToEntry [parameter't: type'Transition'class, parameter'e: type'Entry'class] {
	some variable'0: type'Vertex'class { parameter'e in type'Entry'class && pattern'queries'transition [ parameter't , variable'0 , parameter'e ] }
}
pred pattern'queries'noOutgoingTransitionFromEntry [parameter'e: type'Entry'class] {
	all variable'0: type'Transition'class, variable'1: type'Vertex'class { parameter'e in type'Entry'class && not (pattern'queries'transition [ variable'0 , parameter'e , variable'1 ]) }
}
pred pattern'queries'multipleTransitionFromEntry [parameter'e: type'Entry'class, parameter't1: type'Transition'class, parameter't2: type'Transition'class] {
	parameter't1 in parameter'e.outgoingTransitions'reference'Vertex && (parameter't1 in type'Transition'class && (parameter'e in type'Entry'class && (parameter't2 in parameter'e.outgoingTransitions'reference'Vertex && (parameter't2 in type'Transition'class && parameter't1 != parameter't2))))
}
pred pattern'queries'outgoingFromExit [parameter't: type'Transition'class, parameter'e: type'Exit'class] {
	parameter'e in type'Exit'class && (parameter't in parameter'e.outgoingTransitions'reference'Vertex && parameter't in type'Transition'class)
}
pred pattern'queries'outgoingFromFinal [parameter't: type'Transition'class, parameter'f: type'FinalState'class] {
	parameter'f in type'FinalState'class && (parameter't in parameter'f.outgoingTransitions'reference'Vertex && parameter't in type'Transition'class)
}
pred pattern'queries'noStateInRegion [parameter'region: type'Region'class] {
	all variable'0: type'State'class { parameter'region in type'Region'class && not (pattern'queries'StateInRegion [ parameter'region , variable'0 ]) }
}
pred pattern'queries'StateInRegion [parameter'region: type'Region'class, parameter'state: type'State'class] {
	parameter'state in type'State'class && parameter'state in parameter'region.vertices'reference'Region
}
pred pattern'queries'choiceHasNoOutgoing [parameter'c: type'Choice'class] {
	all variable'0: type'Transition'class, variable'1: type'Vertex'class { parameter'c in type'Choice'class && not (pattern'queries'transition [ variable'0 , parameter'c , variable'1 ]) }
}
pred pattern'queries'choiceHasNoIncoming [parameter'c: type'Choice'class] {
	all variable'0: type'Transition'class, variable'1: type'Vertex'class { parameter'c in type'Choice'class && not (pattern'queries'transition [ variable'0 , variable'1 , parameter'c ]) }
}
fact util'containmentDefinition {
	util'language.util'contains = outgoingTransitions'reference'Vertex + (vertices'reference'Region + (util'language.regions'reference'CompositeElement))
}
fact util'noParentForRoot {
	no parent: type'State'class + (type'Exit'class + (type'Statechart'class + (type'Region'class + (type'CompositeElement'class + (type'State'class + (type'RegularState'class + (type'State'class + (type'Choice'class + (type'Synchronization'class + (type'Pseudostate'class + (type'FinalState'class + (type'Transition'class + (type'Vertex'class + type'Entry'class))))))))))))) { parent->(util'language.util'root) in util'language.util'contains }
}
fact util'atLeastOneParent {
	all child: type'State'class + (type'Exit'class + (type'Statechart'class + (type'Region'class + (type'CompositeElement'class + (type'State'class + (type'RegularState'class + (type'State'class + (type'Choice'class + (type'Synchronization'class + (type'Pseudostate'class + (type'FinalState'class + (type'Transition'class + (type'Vertex'class + type'Entry'class))))))))))))) { child = util'language.util'root or (some parent: type'State'class + (type'Exit'class + (type'Statechart'class + (type'Region'class + (type'CompositeElement'class + (type'State'class + (type'RegularState'class + (type'State'class + (type'Choice'class + (type'Synchronization'class + (type'Pseudostate'class + (type'FinalState'class + (type'Transition'class + (type'Vertex'class + type'Entry'class))))))))))))) { parent->child in util'language.util'contains }) }
}
fact util'noCircularContainment {
	no circle: type'State'class + (type'Exit'class + (type'Statechart'class + (type'Region'class + (type'CompositeElement'class + (type'State'class + (type'RegularState'class + (type'State'class + (type'Choice'class + (type'Synchronization'class + (type'Pseudostate'class + (type'FinalState'class + (type'Transition'class + (type'Vertex'class + type'Entry'class))))))))))))) { circle->circle in ^ (util'language.util'contains) }
}
fact oppositeReference'incomingTransitions'Vertex {
	incomingTransitions'reference'Vertex = ~ target'reference'Transition
}
fact oppositeReference'outgoingTransitions'Vertex {
	outgoingTransitions'reference'Vertex = ~ source'reference'Transition
}
fact errorpattern'queries'noEntryInRegion {
	all p0: type'Region'class { not (pattern'queries'noEntryInRegion [ p0 ]) }
}
fact errorpattern'queries'multipleEntryInRegion {
	all p0: type'Region'class { not (pattern'queries'multipleEntryInRegion [ p0 ]) }
}
fact errorpattern'queries'incomingToEntry {
	all p0: type'Transition'class, p1: type'Entry'class { not (pattern'queries'incomingToEntry [ p0 , p1 ]) }
}
fact errorpattern'queries'noOutgoingTransitionFromEntry {
	all p0: type'Entry'class { not (pattern'queries'noOutgoingTransitionFromEntry [ p0 ]) }
}
fact errorpattern'queries'multipleTransitionFromEntry {
	all p0: type'Entry'class, p1: type'Transition'class, p2: type'Transition'class { not (pattern'queries'multipleTransitionFromEntry [ p0 , p1 , p2 ]) }
}
fact errorpattern'queries'outgoingFromExit {
	all p0: type'Transition'class, p1: type'Exit'class { not (pattern'queries'outgoingFromExit [ p0 , p1 ]) }
}
fact errorpattern'queries'outgoingFromFinal {
	all p0: type'Transition'class, p1: type'FinalState'class { not (pattern'queries'outgoingFromFinal [ p0 , p1 ]) }
}
fact errorpattern'queries'noStateInRegion {
	all p0: type'Region'class { not (pattern'queries'noStateInRegion [ p0 ]) }
}
fact errorpattern'queries'choiceHasNoOutgoing {
	all p0: type'Choice'class { not (pattern'queries'choiceHasNoOutgoing [ p0 ]) }
}
fact errorpattern'queries'choiceHasNoIncoming {
	all p0: type'Choice'class { not (pattern'queries'choiceHasNoIncoming [ p0 ]) }
}
fact UpperMultiplicity'Statechart'class'1 {
	# type'Statechart'class <= 1
}
fact LowerMultiplicity'Statechart'class'1 {
	# type'Statechart'class >= 1
}
run { } for exactly 15 util'Object , 2 Int , exactly 0 String