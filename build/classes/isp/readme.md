ISP - Interface Segregation Principle
Nesse exemplo foi aplicado ISP que define que a interface não deve ser forçada a
 implementar métodos que não usam.
Então eu demonstrei através dos animais mamiferos que possuem ums distinção en
tre aquáticos e terrestres.
Em uma classes geral pela grande maioria ser terrestre teria os métodos andar()
 e respirar() e para baleia teria que inutilizar o método andar() e adicionar um
 método nadar().
Através da aplicação desse princípio eu dividi uma interface em três para englo
bar os mamiferos terrestres e aquáticos e evitar o uso forçado da implementação 
de métodos sem utilização no caso dos mamiferos aquáticos.
