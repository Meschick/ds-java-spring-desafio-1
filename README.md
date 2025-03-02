# Componentes e injeção de dependência 

## Este desafio tem o foco:
1. Criação de componentes ( Services ).
2. Injeção de Dependência.

## CONTEXTO
criar um sistema para calcular o **valor total** de um pedido, considerando uma porcentagem de desconto e o frete. O cálculo do **valor total** do pedido consiste em aplicar o desconto ao **valor básico** do pedido e adicionar o valor do frete. A regra para calculo do frete é a seguinte: 

<table>
 <thead>
    <tr>
      <th>Valor básico do pedido</th>
      <th>Frete</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Abaixo de R$ 100</td>
      <td>R$ 20</td>
    </tr>
     <tr>
      <td>De R$ 100 até R$ 200 exclusive</td>
      <td>R$ 12</td>
    </tr>
     <tr>
      <td>R$ 200 ou mais </td>
      <td>Grátis</td>
    </tr>
  </tbody> 
</table>

### Exemplo de entrada e saída:

<table>
 <thead>
    <tr>
      <th>Entrada ( dados do pedido: código, valor básico, desconto )</th>
      <th>Saída</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>
        - 1034 </br>
        - 150.00 </br>
        - 20
      </td>
      <td>
        - Código Pedido: 1034 </br>
        - Valor Total: R$ 132.00
      </td>
    </tr>
  </tbody> 
</table>
<table>
 <thead>
    <tr>
      <th>Entrada( dados do pedido: código, valor básico, desconto )</th>
      <th>Saída</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>
        - 2282 </br>
        - 800.00 </br>
        - 10
      </td>
      <td>
        - Código Pedido: 2282 </br>
        - Valor Total: R$ 720.00
      </td>
    </tr>
  </tbody> 
</table>
<table>
 <thead>
    <tr>
      <th>Entrada ( dados do pedido: código, valor básico, desconto )</th>
      <th>Saída</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>
        - 1309 </br>
        - 95.90 </br>
        - 0
      </td>
      <td>
        - Código Pedido: 1309 </br>
        - Valor Total: R$ 115.00
      </td>
    </tr>
  </tbody> 
</table>

## Especificações:
O pedido deve ser representado por um Objeto: 

<table>
 <thead>
    <tr>
      <th>Order</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>
        - code: Integer </br>
        - valueBasic: Double </br>
        - discount: Double
      </td>
    </tr>
  </tbody> 
</table>

Criar os seguintes componentes: 

1. OrderService
<table>
 <thead>
    <tr>
      <th>OrderService</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>
       + total(order: Order): double
      </td>
    </tr>
  </tbody> 
</table>

Vai ter uma única responsabilidade, implementar a lógica de desconto.

2. ShippingService 
 <table>
 <thead>
    <tr>
      <th>ShippingService</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>
       + shipment(order: Order): double
      </td>
    </tr>
  </tbody> 
</table>

Vai ter uma única responsabilidade, implementar a lógica de adicionar o frete no valor total.


## Considerações:

A utilização desses conceitos com certeza deixará o nosso código mais flexível, modular, fácil de manter e, o principal, desacoplado.









## Este é um desafio proposto pelo professor Nélio Alves da plataforma DevSuperior(https://devsuperior.com.br/)
