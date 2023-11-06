# Estudo de graphql com spring boot

### Comunicação entre sistemas

 - [] - Representa uma lista ou array.
 - Course! - Indica que a lista contém objetos do tipo Course. O ! após Course significa que o campo não pode ser nulo, ou seja, ele deve ter um valor.
 - Finalmente, o segundo ! depois dos colchetes ([Course!]!) significa que a lista em si (o array) não pode ser nula e também não pode conter valores nulos. Isso implica que a lista de cursos não só precisa existir, mas também deve conter pelo menos um curso.

Em resumo, [Course!]! descreve um campo que é uma lista não nula de objetos do tipo Course, onde a lista em si e seus elementos não podem ser nulos.
git