Injeção de dependências

A injeção de dependências é uma das formas de realizar a inversão de controle, muitas vezes esses dois conceitos são confundidos como sinônimos, mas não são a mesma coisa, a inversão é quando alteramos a forma que um objeto é controlado e a injeção é uma forma direta de inserir uma depência em uma classe para que a responsabilidade de realizar uma atividade não seja mais dela, a classe passará a usar outra estrutura para realizar o comando.

Esse padrão de programação é necessário para reduzir o acoplamento entre os módulos do sistema, utilizando essa técnica, as dependência entre os módulos não são definidas programando, mas sim por uma infraestrutura, ou seja, um container, que vai inserir as dependências declaradas em cada componente.

Essas modificações são importantes para que as classes sejam mais fáceis de realizar manutenção e para ser testável.
Exemplo: Vamos supor que exista uma classe que tenha o objetivo de cadastrar novos usuários em um sistema, ao realizar um cadastro é necessário também armazenar isso em um arquivo, em uma classe com alto nível de acoplamento essas duas tarefas estarão juntas, a classe irá solicitar os dados do cadastro e já realizar a criação do arquivo, utilizando o método de injeção de dependência isso será separado, a classe vai passar a cadastrar o novo usuário e chamar uma outra estrutura que vai realizar a criação de arquivo.

