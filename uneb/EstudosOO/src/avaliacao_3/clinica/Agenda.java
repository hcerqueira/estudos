package clinica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Agenda {
	private Map<String, List<Consulta>> consultas;
	private BancoDeDados bd = BancoDeDados.getInstance();

	private static Agenda instancia = new Agenda();

	public Agenda() {
		this.consultas = new HashMap<>();
	}

	public static Agenda getInstance() {
		return instancia;
	}

	public boolean verificiarDisponibilidade(String dia, String hora, Medico medico) {

		List<Consulta> consultasDia = consultas.get(dia);
		
		if (!consultas.containsKey(dia)) {
			consultas.put(dia, new ArrayList<>());
			System.out.println("Nao tem dia cadastrado");
			return true;
		}

		for (Consulta consulta : consultasDia) {
			if (consulta.getHora().equals(hora) && consulta.getMedico().getNome().equals(medico.getNome())) {
				return false;
			}
		}
		return true;
	}
	
	public void cancelaConsulta(String dia, Consulta consulta){
		List<Consulta> consultasDia = consultas.get(dia);
		if (consultasDia != null) {
		    List<Consulta> consultasDiaAtualizado = new ArrayList<>(consultasDia);
		    for (Consulta c : consultasDia) {
		        if (c.getId() == consulta.getId()) {
		            consultasDiaAtualizado.remove(c);
		        }
		    }
		    consultas.put(dia, consultasDiaAtualizado);
		}
	}

	public void alterarConsulta(String dia, String hora, String novoDia, String novaHora, Consulta consulta, Medico medico) {
		if (!consultas.containsKey(novoDia)) {
			consultas.put(novoDia, new ArrayList<>());
		}
		List<Consulta> consultasNovoDia = consultas.get(novoDia);
		consultasNovoDia.add(consulta);
		consultas.put(novoDia, consultasNovoDia);
		
		List<Consulta> consultasDiaAntigo = consultas.get(dia);
		if (consultasDiaAntigo != null) {
		    List<Consulta> consultasDiaAtualizado = new ArrayList<>(consultasDiaAntigo);
		    for (Consulta c : consultasDiaAntigo) {
		        if (c.getHora().equals(hora) && c.getMedico().equals(medico)) {
		            consultasDiaAtualizado.remove(c);
		        }
		    }
		    consultas.put(dia, consultasDiaAtualizado);
		}
	}

	public void marcarConsulta(String dia, Consulta consulta) {
		if (!consultas.containsKey(dia)) {
			consultas.put(dia, new ArrayList<>());
		}
		List<Consulta> consultasDia = consultas.get(dia);
		consultasDia.add(consulta);
	}
}
