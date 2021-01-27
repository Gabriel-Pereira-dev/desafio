SRP - Single Responsibility Principle
Nesse exemplo eu aplico o SRP que define que uma classe deve ter apenas uma res
ponsabilidade que possa ocasionar sua mudança.

Então nesse pequeno sistema de cadastro de consultas eu separei cada classe com
 apenas uma reponsabilidade:

Medico: responsável por lidar com as informações do medico.
Paciente : responsável por lidar com as informações do paciente.
AgendamentoConsulta: responsável por lidar com as informações da consulta.
AgendamentoConsultaBD: responsavel pela manipulação de dados por array da consul
ta.
