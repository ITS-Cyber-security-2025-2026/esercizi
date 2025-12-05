package it.corso.cyber2025.esercizi_conto_corrente;

import java.util.Scanner;

public class Ui {
	
	private Scanner input = new Scanner(System.in);
	private Account user = new Account();

	public void home() {
		
		while (true) {
			
			System.out.println(
					"-------------------------------------\n" +
			        "          BENVENUTO NEL TUO ATM      \n" +
			        "-------------------------------------\n" +
			        "1) Versamenti\n" +
			        "2) Prelievi\n" +
			        "3) Visualizza il saldo corrente\n" +
			        "4) Mostra gli ultimi 5 movimenti\n" +
			        "5) Esci\n" +
			        "-------------------------------------\n" +
			        "\nSeleziona un'opzione: ");
			
			int opt = input.nextInt();
			
			
			switch (opt) {
			
				case 1:
				
					user.deposit();
					break;
				
				case 2:
				
					user.withdraw();
					break;
				
				case 3:
					
					user.balance();
					break;
				
				case 4:
				
					user.get_last_transaction();
					break;
				
				case 5:
					
					System.out.println(
							"----------------------------------------\r\n" + 
							" Operazione terminata.\r\n" + 
							" Grazie per aver utilizzato i nostri servizi.\r\n" + 
							" Ricordati di ritirare la tua carta e la ricevuta.\r\n" + 
							"----------------------------------------\r\n");
					return;
			}
		}
	}
}
