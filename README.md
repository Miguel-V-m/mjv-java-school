# Arrays e Listas de Arrays
## Arrays
Um array é uma seqüência de valores do mesmo tipo e manipulá-las é bastante trabalhoso.

Essa dificuldade aparece em diversos momentos:
- não podemos redimensionar um array em Java;
- é impossível buscar diretamente por um determinado elemento cujo índice não se sabe;
- não conseguimos saber quantas posições do array já foram populadas sem criar, para isso,
métodos auxiliares.

Além dessas dificuldades que os arrays apresentavam, faltava um conjunto robusto de classes para suprir a
necessidade de estruturas de dados básicas, como listas ligadas e tabelas de espalhamento.

Com esses e outros objetivos em mente, o comitê responsável pelo Java criou um conjunto de classes e interfaces
conhecido como Collections Framework, que reside no pacote java.util desde o Java2 1.2.

## Listas: Java.util.list
Um primeiro recurso que a API de Collections traz são listas. Uma lista é uma coleção que
permite elementos duplicados e mantém uma ordenação específica entre os elementos.

Em outras palavras, você tem a garantia de que, quando percorrer a lista, os elementos serão
encontrados em uma ordem pré-determinada, definida na hora da inserção dos mesmos. Ela resolve
todos os problemas que levantamos em relação ao array (busca, remoção, tamanho "infinito",...).
A API de Collections traz a interface java.util.List , que especifica o que uma classe deve ser
capaz de fazer para ser uma lista. Há diversas implementações disponíveis, cada uma com uma forma
diferente de representar uma lista.

A implementação mais utilizada da interface List é a ArrayList, que trabalha com um array
interno para gerar uma lista. Portanto, ela é mais rápida na pesquisa do que sua concorrente, a
LinkedList, que é mais rápida na inserção e remoção de itens nas pontas.

## Arraylist não é um Array !
É comum confundirem uma ArrayList com um array, porém ela não é um array. O que
ocorre é que, internamente, ela usa um array como estrutura para armazenar os dados, porém este
atributo está propriamente encapsulado e você não tem como acessá-lo. Repare, também, que você
não pode usar [] com uma ArrayList , nem acessar atributo length. Não há relação!

Para criar um ArrayList, basta chamar o construtor:

- ArrayList lista = new ArrayList();

É sempre possível abstrair a lista a partir da interface List:

- List lista = new ArrayList();

Para criar uma lista de nomes ( String ), podemos fazer:

- List lista = new ArrayList();
- lista.add("Manoel");
- lista.add("Joaquim");
- lista.add("Maria");

A interface List possui dois métodos add, um que recebe o objeto a ser inserido e o coloca no
final da lista, e um segundo que permite adicionar o elemento em qualquer posição da mesma. Note que,
em momento algum, dizemos qual é o tamanho da lista; podemos acrescentar quantos elementos
quisermos, que a lista cresce conforme for necessário.

Toda lista (na verdade, toda Collection ) trabalha do modo mais genérico possível. Isto é, não há
uma ArrayList específica para Strings , outra para Números, outra para Datas etc. Todos os
métodos trabalham com Object.

Vamos ver por exemplo o tipo ArrayList<contabancária> denota uma lista de arrays de contas bancárias.
Os colchetes angulares em torno do tipo contabancária é um "parâmetro" de tipo.
Podemos substituir 'contabancária" por qualquer outra classe e obter um tipo diferente de lista de arrays.
Por essa razão, ArrayList é chamado de classe genérica.

Temos em mente que não pode utilizar tipos primitivos como parâmetros
de tipo – não há nenhum ArrayList< int > ou ArrayList< double >.

  
