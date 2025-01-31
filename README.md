# 🖩 Calculadora RMI - Java

Este projeto é uma aplicação distribuída utilizando **Java RMI (Remote Method Invocation)** para realizar operações matemáticas remotamente. O cliente se conecta ao servidor via RMI para solicitar cálculos.

## 🚀 Tecnologias utilizadas
- Java
- RMI (Remote Method Invocation)

## 📌 Estrutura do Projeto
- `Calculadora.java` → Interface remota com os métodos disponíveis.
- `CalculadoraImpl.java` → Implementação da interface no servidor.
- `Servidor.java` → Inicia o serviço RMI e registra a calculadora.
- `Cliente.java` → Conecta ao servidor e faz chamadas remotas.

## 🔧 Como executar?
### 1️⃣ Compilar os arquivos:
```sh
javac *.java
