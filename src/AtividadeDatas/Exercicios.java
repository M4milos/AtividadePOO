package AtividadeDatas;
import java.time.format.DateTimeFormatter;
import java.time.Instant;
/*
Mostrar quantidade de sabados e domingos entre 2 datas

Dias uteis entre duas datas levando em conta feriados (Vetor de dias de feriado)

Mostrar datas de pagamento de conta, recebo o número de parcelas e mostra as datas de 30 em 30 dias, vencimento sempre dia útil, verificar feriados também

Que dia da semana cai o dia ??/??/????;

Crie um método que receba o mês e o ano e retorne uma lista com todos os dias do mês informados.


	Mês de 30 dias:
		abril 4
		junho 6
		setembro 9
		novembro 11
	Mês de 31 dias:
		janeiro 1
		março 3
		maio 5
		julho 7
		agosto 8
		outubro 10
		dezembro 12
	Mês de 28 ou 29 dias:
		fevereiro 2
		
*/

public class Exercicios {
	private int dia;
	private int mes;
	private int ano;
	private int[] feriados;
	private int[] diasUteis;
	private boolean feriado;
	private static int contadorSabados;
	private static int contadorDomingos;
	
	
	public Exercicios(int dia, int mes, int ano) {
		
	}
	
	public Exercicios(int dia, int mes, int ano, int[] feriados) {
		
	}
	
	public int getDia() {
		return dia;
	}
	
	public void setDia(int dia) {
		this.dia = dia;
	}
	
	public int getMes() {
		return mes;
	}
	
	public void setMes(int mes) {
		this.mes = mes;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public boolean isFeriado() {
		return feriado;
	}
	
	public void setFeriado(boolean feriado) {
		this.feriado = feriado;
	}
	
	public int[] getDiasUteis() {
		return diasUteis;
	}
	
	public void setDiasUteis(int[] diasUteis) {
		this.diasUteis = diasUteis;
	}
	
	public int[] getFeriados() {
		return feriados;
	}
	
	public void setFeriados(int[] feriados) {
		this.feriados = feriados;
	}
	
	public static int ContaSabados(Instant data_inicial, Instant data_final) {
		
		
		
		
		return 1;
	}
	
}
