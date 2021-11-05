State

Durante o desenvolvimento de software ocorre de encontrarmos situações em que o objeto muda de comportamento, dependendo do seu estado, para conseguir definir essa rotina de tarefas pode ser usado o padrão de projeto de software "State".

É difícil definir a mudança de comportamento e os estados de um objeto dentro de um mesmo bloco de código. De acordo com o número de estados existentes para um objeto pode implicar em uma alta complexidade para manter o código, em alguns casos, pode oocorrer a inconsistências de estados atuais, podendo ter variávais para cada estado. 

O padrão State cria um objeto para cada estado existente do objeto que faz a chamada. É implementado uma classe com um método para cada modo, que o objeto pode assumir, individualmente. Esse objeto que assume esses estados, vai se comportar de acordo com sua condição, com a implementação das classes de estado. Dessa forma, o estado atual sempre está no objeto e, ao mesmo tempo, é feita a comunicação com os outros estados, concluindo suas responsabilidades. Além disso, é introduzida uma classe abstrata que representa os estados e uma interface para todas as classes. 
