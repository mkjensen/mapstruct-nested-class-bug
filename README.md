# Generated code does not include enclosing class when referring to nested class

Bug in MapStruct 1.5.1.Final:
`./mvnw clean compile -Dorg.mapstruct.version=1.5.1.Final`

Works with MapStruct 1.4.2.Final:
`./mvnw clean compile -Dorg.mapstruct.version=1.4.2.Final`

An issue has been created for MapStruct at https://github.com/mapstruct/mapstruct/issues/2880.
