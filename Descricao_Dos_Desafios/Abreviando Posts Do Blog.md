# Abreviando Posts Do Blog

Leonardo é um nômade digital e viaja pelo mundo programando em diferentes cafés das cidades por onde passa. Recentemente, resolveu criar um blog, para compartilhar suas experiências e aprendizados com seus amigos.

Para criação do blog, ele optou por utilizar uma ferramenta pronta, que há um limite de caracteres que se pode escrever por dia, e Leonardo está preocupado que essa limitação, afinal, irá impedir de contar suas melhores experiências. Para contornar esse problema, decidiu usar um sistema de abreviação de palavras em seus posts.

O sistema de abreviações é simples e funciona da seguinte forma: para cada letra, é possível escolher uma palavra que inicia com tal letra e que aparece no post. Uma vez escolhida a palavra, sempre que ela aparecer no post, ela será substituída por sua letra inicial e um ponto, diminuindo assim o número de caracteres impressos na tela.

Por exemplo, na frase: “hoje eu programei em Python”, podemos escolher a palavra “programei” para representar a letra ‘p', e a frase ficará assim: “hoje eu p. em Python”, economizando assim sete caracteres. Uma mesma palavra pode aparecer mais de uma vez no texto, e será abreviada todas as vezes. Note que, se após uma abreviação o número de caracteres não diminuir, ela não deve ser usada, tal como no caso da palavra “eu” acima.

Leonardo precisa que seu post tenha o menor número de caracteres possíveis, e por isso pediu a sua ajuda. Para cada letra, escolha uma palavra, de modo que ao serem aplicadas todas as abreviações, o texto contenha o menor número de caracteres possíveis.



Sabendo disse, foi preparado uma solução em **Java** que receba um arquivo **.txt**  com a entradas mostradas no exemplo dado: `abcdef abc abc abc\n.`.  A entrada, é composto de uma linha, contendo uma frase de até 10⁴ caracteres. A frase é composta de palavras e espaços em branco, e cada palavra é composta de letras minúsculas ('a'-'z'), e contém entre 1 e 30 caracteres cada.

O último caso de teste é indicado quando a linha dada conter apenas um “.”, o qual não deverá ser processado.

Na saída é preciso imprimir uma linha contendo a frase já com as abreviações escolhidas e aplicadas.

Em seguida, imprima um inteiro N, indicando o número de palavras em que foram escolhidas uma letra para a abreviação no texto. Nas próximas N linhas, imprima o seguinte padrão “C. = P”, onde C é a letra inicial e P é a palavra escolhida para tal letra. As linhas devem ser impressas em ordem crescente da letra inicial.  Exemplo de saida: `a. abc abc abc\n1\na. = abcdef`.

## Lendo Dados De Arquivos

Apesar de ser encontrado formas que usam poucas linhas para poder ler um arquivo; a forma que funcionou foi a apresentada pelo site **DevMedia** [1].  Onde é escrito dois métodos: `leitor()` e `escritor()`. Porém, apenas um método foi usado; o método `leitor()` e para escrever a saida em um arquivo **.txt** foi adaptado, ou seja, toda lógica ficou no método `solucao()`. Para escrever as saidas apresentadas em *console*, foi usado o exemplo mostrado no site **ti-enxame.com**[2].  Em suma, para ler o conteudo de um arquivo **txt** é preciso instanciar  um objeto da classe `BufferedReader` juntamente com o construtor da classe `FileReader` que irá procurar pelo arquivo no computador; ficando assim:

```
BufferedReader buffRead = new BufferedReader(new FileReader(entrada));
```

Instanciado o objeto. Cada linha  encontrada no arquivo é atribuido a uma variavel do tipo `String`:

```java
String frase = buffRead.readLine()
        .trim()
        .toLowerCase()
        .replaceAll("\n", " ")
        .replaceAll("\t", " ");
```

E para salvar a saida do *console*, primeiro é instanciado um objeto da classe `PrintStream` juntamente com o construtor da classe `FileOutputStream`, do qual irá criar um arquivo com o nome e no caminho especificado na `String` que esta classe recebe (`String saida = "./src/output/output.txt";`):

```java
PrintStream write = new PrintStream(new FileOutputStream(saida));
```

Em seguida é usar este objeto para salvar no arquiv **.txt** o que queremos, neste caso é possivel encontra trechos no código como este:

```java
write.println(fraseAbreviada);
```

[1]: https://www.devmedia.com.br/leitura-e-escrita-de-arquivos-de-texto-em-java/25529	"Leitura e escrita de arquivos de texto em Java"
[2]: https://www.ti-enxame.com/pt/java/como-gravar-saida-do-console-em-um-arquivo-txt/968746655/	"Como gravar a saída do console em um arquivo txt"

 



