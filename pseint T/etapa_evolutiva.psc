Algoritmo etapa_evolutiva
	definir Edad como entero 
	escribir "cual es su edad?"
	leer Edad
	Si Edad <=6 Entonces
		escribir "Usted se encuentra en la infancia"
	SiNo
		Si Edad<=12  Entonces
			Escribir "Uted se encuentra en la niñes" 
		SiNo
			Si  Edad<=20 Entonces
				escribir "Uted se encuentra en la adolecencia"
			SiNo
				Si Edad<=25 Entonces
					Escribir "Uted se encuentra en la juventud"
				SiNo
					Si Edad<=60 Entonces
						Escribir "Usted se ecuentra en la adultez"
					SiNo
						escribir "Usted se encuentra en la vejez"
					Fin Si
				Fin Si
			Fin Si
		Fin Si
	Fin Si

FinAlgoritmo
