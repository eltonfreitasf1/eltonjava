int opcao;
        do {
                System.out.println("\n==============================");
            System.out.println("      BYTEBURGER SYSTEM");
            System.out.println("==============================");
            System.out.println("1- Novo Pedido");
            System.out.println("2- Consultar Cardápio por Categoria");
            System.out.println("3- Calcular Troco");
            System.out.println("4- Sorteio do Dia");
            System.out.println("0- Encerrar");
            System.out.println("Selecione uma opção");

opcao = scanner.nextInt();
 
            switch (opcao) {
        case 1:
        scanner.nextLine();
                    System.out.println("Digite o seu nome: ");
String cliente = scanner.nextLine();

double total = 0;
String continuar;

ArrayList<Integer> itens = new ArrayList<>();
                    do {
                            System.out.println("\n====== Cardapio ======");
                        for (int i = 0; i < nomes.length; i++) {
        System.out.println((i + 1) + " - " + nomes[i] + " | R$ " + precos[i]);
        }
int codigo;

                        while (true) {
                                System.out.print("Digite o código do item: ");

                            while (!scanner.hasNextInt()) {
        System.out.println("Digite um número válido:");
                                scanner.next();
                            }

codigo = scanner.nextInt();

                            if (codigo >= 1 && codigo <= nomes.length) {
        break;
        }

        System.out.println("Código inválido!");
                        }

total += precos[codigo - 1];
        itens.add(codigo - 1);
                        System.out.println(nomes[codigo - 1] + " adicionado!");

                        System.out.print("\nAdicionar mais itens? (s/n)\n");

                        do {
continuar = scanner.next().toLowerCase();

                            if (!continuar.equals("s") && !continuar.equals("n")) {
        System.out.println("Digite apenas 's' ou 'n'");
                            }

                                    } while (!continuar.equals("s") && !continuar.equals("n"));

        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("Cliente: " + cliente);
                    System.out.println("Itens:");
                    for (int i : itens) {
        System.out.printf("- %s R$ %.2f\n", nomes[i], precos[i]);
                    }
                            System.out.printf("Total a pagar: R$ %.2f\n", total);
                    break;