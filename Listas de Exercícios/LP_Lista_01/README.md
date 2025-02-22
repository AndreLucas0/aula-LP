![senai_logo](https://transparencia.sp.senai.br/Content/img/logo-senai.png)

# Lista de Exercícios 01: Fluxogramas

Profº.: Cainã Antunes Silva  
Faculdade de Tecnologia **SENAI Sorocaba**  
Tecnólogo em Análise e Desenvolvimento de Sistemas (ADS)
___


> O objetivo desta aula é exercitar o raciocínio lógico para a criação de algoritmos através de fluxogramas.  

O fluxo de um algorítmo poder ser representado graficamente através de fluxogramas. Um conjunto de símbolos, representam cada ação realizada pelo programa, além disso, setas conectam estes símbolos uns com os outros indicando a sequencia em que as ações são executadas.

Para mais informações acesse [Aula 01: Fluxogramas.](https://www.notion.so/cainaantunes/Aula-01-Fluxogramas-188bde521b3b80de90f7dbd9407af71e)

***

1. Crie o fluxograma de um programa que solicita que o usuário digite sua nota e em seguida o programa exibe se o aluno foi “Aprovado” ou “Reprovado”. Leve em consideração que a nota deve estar entre 0 e 100 e que a condição para aprovação é ter uma nota igual ou superior à 50.
   
    ```mermaid
   
    flowchart TD
        start(( Início )) --> input[\ Digite sua Nota \]
        input --> verification{ Nota >= 50? }
        verification --> |Sim| A[/ Aprovado /]
        verification --> |Não| B[/ Reprovado /]
        A --> finish([ Fim ])
        B --> finish
    ```
   
2. Altere o exemplo anterior, acrescentando as seguintes condições: para ser o aprovado, o aluno precisar ter nota igual ou superior à 50 e frequência igual ou superior a 75%.
   
   ```mermaid
   flowchart TD
      Start((Start)) --> input1[\ Write your score \]
      input1 --> verification1{ Score >= 50? }
      verification1 --> |Yes| input2[\ Write your frequency porcentage \]
      input2 --> verification2{ Frequency >=75%? }
      verification2 --> |Yes| A[/ Approve /]
      verification2 --> |No| B
      verification1 --> |No| B[/ Disapprove /]
      A --> finish([ Finish ])
      B --> finish
      
   ```
   
3. Crie um fluxograma para calcular a soma de dois números fornecidos pelo usuário.
   
   ```mermaid
   flowchart TD
       Start((Start)) --> input1[\ Write the first number \]
       input1 --> value1[ Read and set x value ]
       value1 --> input2[\ Write the second number \]
       input2 --> value2[ Read and set y value ]
       value2 --> sum[ Do the equation x+y ]
       sum --> value3[ Set z value ]
       value3 --> output[/ The value of the sum is: z /]
       output --> finish([ Finish ])
   ```
   
4. Elabore um fluxograma que leia um número e exiba se ele é positivo ou negativo.
   
   ```mermaid
   flowchart TD
      Start((Start)) --> input1[\ Write the number \]
      input1 --> verification1{ Number > 0? }
      verification1 --> |Yes| A[/ Positive /]
      verification1 --> |No| verification2{ Number = 0? }
      verification2 --> |Yes| C[/ Neutral /]
      verification2 --> |No| B[/ Negative /]
      A --> finish([ Finish ])
      B --> finish
      C --> finish
   ```
   
5. Desenvolva um fluxograma que leia a idade de uma pessoa e indique se ela pode votar.
   
   ```mermaid
   flowchart TD
       start(( Start )) --> input1[\ Write your age \]
        input1 --> verification1{ Age >= 16? }
        verification1 --> |Yes| A[/ You can vote /]
        verification1 --> |No| B[/ You can't vote /]
        A --> finish([ Finish ])
        B --> finish
   ```
   
6. Crie um fluxograma que leia dois números e determine o maior entre eles.
   
   ```mermaid
   flowchart TD
      Start((Start)) --> input1[\ Write the first number \]
       input1 --> value1[ Read and set x value ]
       value1 --> input2[\ Write the second number \]
       input2 --> value2[ Read and set y value ]
       value2 --> verification1{ x>y? }
       verification1 --> |Yes| A[/ X is greater than Y /]
       verification1 --> |No| verification2{ x=y ?}
       verification2 --> |Yes| B[/ X is equal to Y /]
       verification2 --> |No| C[/ Y is greater than X /]
       A --> finish([ Finish ])
       B --> finish
       C --> finish

   ```
   
7. Crie um fluxograma que leia três números e determine o maior entre eles.
   
   ```mermaid
   flowchart TD
            Start((Start)) --> input1[\ Write the first number \]
       input1 --> value1[ Read and set x value ]
       value1 --> input2[\ Write the second number \]
       input2 --> value2[ Read and set y value ]
      value2 --> input3[\ Write the third number \]
       input3 --> value3[ Read and set z value ]
       value3 --> verification1{ x > y && z? }
       verification1 --> |Yes| A[/ X is greater than Y and Z /]
       verification1 --> |No| verification2{ y > x && z ?}
       verification2 --> |Yes| B[/ Y is greater than X and Z /]
       verification2 --> |No| verification3{ x=y=z? }
       verification3 --> |Yes| C[/ All numbers are the same /]
       verification3 --> |No| D{ Z is greater than X and Y }
       A --> finish([ Finish ])
       B --> finish
       C --> finish
       D --> finish
   ```
   
8. Construa um fluxograma para calcular o fatorial de um número fornecido pelo usuário.
   
   ```mermaid
   flowchart TD
      Start((Start)) --> input1[\ Write the first number \]
      input1 --> value1[ Read and set x value ]
      value1 --> verification1{" n > 1 and n ∈ N ? "}
      verification1 --> |No| A[Answer = r]
      verification1 --> |Yes| B["r=r*n"]
      A --> finish([Finish])
      B --> verification2[n=n-1]
      verification2 --> verification1

   ```
   
9. Elabore um fluxograma para verificar se um número digitado pelo usuário é par.
   
   > Em várias linguagens de programação, o operador % retorna o resto da divisão entre dois números.    
   > 
   >**Exemplos**:  
   > - 9 % 2 = 1  
   > - 11 % 3 = 2
   
   ```mermaid
   flowchart TD
      start(( Start )) --> input1[\ Write the number \]
        input1 --> value1[ Set x value ]
        value1 --> verification1{ x % 2 = 1? }
        verification1 --> |Yes| A[/ The number is even /]
        verification1 --> |No| B[/ The number is odd /]
        A --> finish([ Finish ])
        B --> finish
   ```
   
10. Elabore um fluxograma para verificar se um número digitado pelo usuário é primo.
   
   ```mermaid
   flowchart TD
      start(( Start )) --> input1[\ Write the number \]
      input1 --> value1[ Set x value ]
      value1 --> verification1{ x<2? }
      verification1 --> |Yes| C
      verification1 --> |No| B[i=x/2]
      B --> verification2{i>1?}
      verification2 --> |Yes| verification3{x % i == 0?}
      verification2 --> |No| E[/It's prime/]
      verification3 --> |Yes| C[/It's not prime/]
      verification3 --> |No| D[i=i-1]
      D --> verification2
      C --> finish([Finish])
      E --> finish
   ```