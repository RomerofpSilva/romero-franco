package avaliacao_POO;

import java.time.LocalDate;

public class javaCar {

	public static void main(String[] args) {
		
		carro c1 = new carro("Volkswagen", "Gol", "FTX2A45", LocalDate.of(2010, 1, 1), 21000, LocalDate.of(2024, 3, 14));
		carro c2 = new carro("Chevrolet", "Onix", "JKM9B12", LocalDate.of(2015, 1, 1), 38.000, LocalDate.of(2024, 11, 29));
		carro c3 = new carro("Honda", "Civic", "LPR4C67", LocalDate.of(2010, 1, 1), 34.000, LocalDate.of(2023, 6, 7));
		carro c4 = new carro("Chevrolet", "Cruze", "QWE7D89", LocalDate.of(2019, 1, 1), 79.000, LocalDate.of(2025, 1, 18));
		carro c5 = new carro("Volkswagen", "Polo", "ZTR1F23", LocalDate.of(2019, 1, 1), 58.000, LocalDate.of(2024, 8, 25));
		
		System.out.println();
		
	}

}
