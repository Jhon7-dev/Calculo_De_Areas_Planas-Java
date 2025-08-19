# Cálculo de Áreas de Figuras Planas: Herança e Interfaces em Java

##  Descrição do Projeto

Este projeto é uma aplicação em Java que utiliza conceitos avançados de Programação Orientada a Objetos (POO) para calcular e exibir a área de diversas figuras geométricas planas. A solução foi projetada com uma arquitetura flexível e extensível, combinando o uso de uma **classe abstrata** e uma **interface**.

O design permite que cada figura (Quadrado, Retângulo, Círculo, Losango, Trapézio, Triângulo) tenha suas próprias características e métodos de cálculo, enquanto compartilha comportamentos comuns definidos em uma classe e um contrato de interface.

--- Funcionalidades ---

O sistema é capaz de:

--- Calcular a área de 6 figuras geométricas planas distintas.
--- Gerar um relatório detalhado para cada figura, exibindo seus atributos e o resultado da área calculada.
--- Demonstrar o polimorfismo, permitindo que todas as figuras sejam tratadas de maneira uniforme através de suas classes-mãe.

## Estrutura do Código

A solução é baseada em uma hierarquia de classes que utiliza tanto a herança (`extends`) quanto a implementação de interfaces (`implements`).

 **`FiguraGeometrica.java` (Interface):**
    * Define o **contrato** fundamental para o cálculo de área. Obriga todas as classes que a implementam a possuírem o método `calcularArea()`.

**`FigurasPlanas.java` (Classe Abstrata):**
    * Atua como a classe-pai para todas as figuras.
    * Fornece um método abstrato "relatorio()", que cada classe filha deve implementar para exibir suas informações específicas.

**Classes Concretas (Figuras):**
    * `Circulo.java`, `Losango.java`, `Quadrado.java`, `Retangulo.java`, `Trapezio.java`, `Triangulo.java`
    * Cada uma dessas classes **estende** a classe abstrata `FigurasPlanas` e **implementa** a interface `FiguraGeometrica`.
    * Elas contêm os atributos específicos de cada figura e implementam os métodos `calcularArea()` e `relatorio()` de acordo com suas respectivas lógicas.
