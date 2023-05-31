import java.util.Scanner;

public class ProgramaData {
    public static void main(String[] args) {
        Data data = new Data();
        
        System.out.println("Data atual:");
        System.out.println("Dia: " + data.retDia());
        System.out.println("M�s: " + data.retMes());
        System.out.println("Ano: " + data.retAno());
        
        System.out.println("\nDigite uma nova data:");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Dia: ");
        int dia = scanner.nextInt();
        data.entraDia(dia);
        
        System.out.print("M�s: ");
        int mes = scanner.nextInt();
        data.entraMes(mes);
        
        System.out.print("Ano: ");
        int ano = scanner.nextInt();
        data.entraAno(ano);
        
        System.out.println("\nData atualizada:");
        System.out.println("Dia: " + data.retDia());
        System.out.println("M�s: " + data.retMes());
        System.out.println("Ano: " + data.retAno());
        
        System.out.println("\nData formatada:");
        System.out.println(data.mostra1());
        
        System.out.println("\nData formatada com m�s por extenso:");
        System.out.println(data.mostra2());
        
        System.out.println("\n� bissexto? " + data.bissexto());
        
        System.out.println("\nDias transcorridos desde o in�cio do ano: " + data.diasTranscorridos());
        
        System.out.println("\nApresenta��o da data atual:");
        data.apresentaDataAtual();
        
        scanner.close();
    }
}
