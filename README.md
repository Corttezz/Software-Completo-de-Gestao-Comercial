# Software Completo de Gestao Comercial  
Um sistema para gestão de ordem de serviços (Sistema OS) de uma assistência técnica de computadores e periféricos.

Este projeto é muito popular e serve como modelo para outros projetos de gestão de serviços, como por exemplo assistências técnicas de smartphones, eletrodomésticos, oficinas mecânicas etc.

Fornece uma base sólida para aprender a desenvolver um sistema desktop usando a linguagem Java e o banco de dados MySQL.

# Curso guia do Projeto
Curso: [Java MySQL - Sistema Completo - Projeto](https://alunos.workover.com.br/courses/177) <br>
Professor: [José de Assis](https://github.com/professorjosedeassis) <br>
Redes sociais do Professor:<p align="left">
<a href="https://www.youtube.com/c/roboticapraticabr" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/youtube.svg" alt="roboticapraticabr" height="30" width="40" /></a>
<a href="https://linkedin.com/in/professorjosedeassis" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/linked-in-alt.svg" alt="professorjosedeassis" height="30" width="40" /></a>
<a href="https://fb.com/professorjosedeassis" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/facebook.svg" alt="professorjosedeassis" height="30" width="40" /></a>
<a href="https://instagram.com/prof.joseassis" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/instagram.svg" alt="prof.joseassis" height="30" width="40" /></a>
<a href="https://twitter.com/joseassis" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/twitter.svg" alt="joseassis" height="30" width="40" /></a>
</p>

# Projeto Completo
## Parte 1 - Conexão com Banco de Dados, Login e Permissões do Usuário
- Ao inicializar o programa, se estivar conectado ao banco de dados MySQL, um ícone será mostrado no canto inferior esquerdo.
<div align="center">
<img src="https://user-images.githubusercontent.com/106662629/203442815-5e0c0779-aab0-4709-bd4e-834c1baa5375.png">
</div>

- Após efetuado o login, a tela principal do Software será exibida, constando na direita a data e o tipo de permissão que o usuário tem.

<div align="center">
<img src="https://user-images.githubusercontent.com/106662629/203443805-c453d0ff-93bf-42c2-a543-eb498b613c6c.png" width="600px">
</div>

- Dependendo do perfil logado, o usuário poderá ou não ter acesso a algumas funcionalidades do programa.

<div align="center">
<img src="https://user-images.githubusercontent.com/106662629/203443905-7ecd8e2a-6edc-45a2-89a3-c7d5d71adf95.png"width="400px">
<img src="https://user-images.githubusercontent.com/106662629/203443931-14ab21ab-da3f-47a4-829b-72b8c8190d79.png"width="400px">
</div>

## Parte 2 - Tela de Usuários

- Caso o usuário tenha as permissões necessárias para acessar esse recurso do programa, ele poderá adicionar, remover, consultar e modificar usuários do sistema (CRUD).
<div align="center">
<img src="https://user-images.githubusercontent.com/106662629/203445331-835ee8e3-4847-48c1-abe1-c8fe27539c88.png" width="600px">
</div>

## Parte 3 - Tela de Clientes
- Nesse caso, se o usuário ter acesso as permissões necessárias para acessar esse recurso do programa, ele poderá adicionar, remover, consultar e modificar CLIENTES do sistema (CRID).
<div align="center">
<img src="https://user-images.githubusercontent.com/106662629/203447196-c4fd6201-a88b-428e-a39c-9597d77c1bdf.png" width="600px">
</div>

- Essa tela tem um recurso de pesquisa avançado, onde na medida que o usuário for digitando o nome para realizar a consulta, ela se atualiza com os dados automaticamente, sendo possível selecionar o cliente desejado diretamente.

## Parte 4 - Tela de Orçamento de Serviços
- Caso o usuário tenha as permissões necessárias para acessar esse recurso do programa, ele poderá adicionar, remover, consultar e modificar Orçamentos de Serviços do sistema (CRUD).

<div align="center">
<img src="https://user-images.githubusercontent.com/106662629/203447251-1956f6a2-3837-4f36-8b33-17374ac39516.png" width="600px">
</div>

- Essa tela conta também com a funcionalidade de pesquisa de Clientes por meio de uma tabela, data precisa gerada a partir da emissão da OS, possiblidade de seleção da situação do produto, possibilidade de imprimir e gerar um arquivo da Ordem de Serviço do cliente e como dito antes conta também com todas funcionalidades do CRUD, se relacionando diretamente com o bando de dados. 

## Bibliotecas Utilizadas:
[atxy2k](http://atxy2k.github.io/RestrictedTextField/)

[driver MySQL](https://dev.mysql.com/downloads/connector/j/)

[rs2xml](https://sourceforge.net/projects/finalangelsanddemons/files/rs2xml.jar/download)
## Ferramentas Utilizadas:
[openJDK 8 (LTS)](https://adoptopenjdk.net/)

[NetBeans IDE 8.2](https://netbeans-ide.informer.com/8.2/)

[iReport-5.6.0](https://sourceforge.net/projects/ireport/)

em desenvolvimento



