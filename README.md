# 1SEM-CheckPoint2-POO
CheckPoint 2 - 1º Semestre Programação Orientada a Objetos

Sistema de Controle de Estacionamento 

Você foi contratado(a) para desenvolver um sistema de controle do estacionamento da faculdade (em linguagem de programação Java usando o paradigma de programação orientada a objetos). O estacionamento deseja um sistema para cadastrar usuários e seus veículos, além de controlar a entrada e saída dos veículos. O sistema está em sua primeira versão e você deverá implementar apenas as funcionalidades descritas a seguir. O pagamento é calculado com base no tempo de permanência no estacionamento, cobrado por minuto. 

Requisitos Funcionais: 

1. Usuários (proprietário): cada usuário possui um nome, CPF e um identificador único (neste momento não precisa de validação).
   
2. Veículos: cada veículo deve ter uma placa, marca, modelo e cor. O veículo deve estar vinculado a um usuário.

3. Controle: representa o controle de entrada e saída de veículos do estacionamento. O controle precisa dos dados do veículo, do horário de entrada e do horário de saída. O horário deve estar no formato hh:mm, por exemplo, 15:11. Sugestão: crie uma Hora com os atributos hora e minuto.

4. Teste da aplicação: você deverá gerar alguns objetos (pelo menos 4) que representam os controles de entrada e saída de veículos (os objetos devem ser armazenados em um array ou uma lista). Em seguida:

a) Imprima uma listagem (saída no console) contendo o nome do usuário, a placa e o modelo do veículo, o horário de entrada e o horário de saída de cada veículo.

b)Imprima o valor que cada um dos veículos irá pagar pelo tempo de permanência. A cobrança é feita por minutos (R$ 0,20 por minuto). Supondo que o horário seja 15:11 o tempo em minutos será: 15 * 60 + 11 = 911.

c) Imprima o valor total que o estacionamento faturou com a entrada e saída dos veículos. 

Requisitos Não Funcionais: 

- O sistema deve ser desenvolvido em Java.
- Utilizar o paradigma de programação orientada a objetos.
- O código deve ser claro, facilitando a manutenção e futuras atualizações. 
