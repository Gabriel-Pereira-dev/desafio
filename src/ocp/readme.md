## OCP - Open-Closed Principle
#### Nesse exemplo eu aplico o OCP que define que todos os objetos ou entidadees devem estar abertos para extensão e fechados para modificação.
#### Então pra exemplificar eu fiz um pequeno sistema de pagar mensalidade de um curso de faculdade:
#### Durante a execução recebo os valores do saldo e o curso do aluno.
#### Depois recebo a modalidade e a partir dela o método pagarMensalidade() de FolhaDePagamento se modifica para a modalidade do curso e retorna o saldo restante do aluno para os seus dados.
#### O OCP se aplica na parte de adicionar novas modalidades como o FIES porque agora é so uma classe implementar a interface modalidade que ela extende a entidade sem modifica-la, assim seguindo esse principio. 
