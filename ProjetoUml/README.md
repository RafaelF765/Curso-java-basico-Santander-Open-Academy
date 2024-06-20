# POO - Projeto Desafio
### Moelagem UML Primeiro Iphone e suas funcionalidades

```mermaid
    classDiagram
    Iphone <|-- ReprodutorMusical
    Iphone <|-- AparelhoTelefonico
    Iphone <|-- NavegadorInternet

    class ReprodutorMusical{
        + void tocar()
        + void pausar()
        + String selecionarMusica(String musica)
    } 

    class AparelhoTelefonico{
        + void ligar(String numero)
        + void atender()
        - iniciarCorreioDeVoz()
    }

    class NavegadorInternet{
        + void exibirPaginaUrl(String url)
        + void adicionarNovaAba()
        + void atualizarPagina
    }
 
```
## Implementação simples em Java

A implementação simples feita somente para demonstrar a estruturação das classes e dos seus métodos de funções.