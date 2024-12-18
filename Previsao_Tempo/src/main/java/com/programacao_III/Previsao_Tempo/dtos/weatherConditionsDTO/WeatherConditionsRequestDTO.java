package com.programacao_III.Previsao_Tempo.dtos.weatherConditionsDTO;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.programacao_III.Previsao_Tempo.models.weatherconditions.WeatherConditions;

import java.util.List;

// A classe WeatherConditionsRequestDTO é usada para representar a solicitação que contém as condições climáticas
// de uma cidade. Essa classe faz parte da estrutura de dados para a comunicação entre o cliente e o servidor,
// geralmente na troca de informações sobre o clima.
public class WeatherConditionsRequestDTO {

    // A anotação @JsonAlias("weather") é usada para mapear o campo 'weather' do JSON para a variável 'weatherConditions'.
    // O nome 'weather' no JSON será associado ao campo 'weatherConditions' na classe.
    @JsonAlias("weather")
    private List<WeatherConditions> weatherConditions;

    // Construtor padrão (necessário para a deserialização do JSON)
    public WeatherConditionsRequestDTO() {}

    // Construtor com parâmetros para inicializar o campo 'weatherConditions'.
    public WeatherConditionsRequestDTO(List<WeatherConditions> weatherConditions) {
        this.weatherConditions = weatherConditions;
    }

    // Método getter para acessar o campo 'weatherConditions'.
    public List<WeatherConditions> getWeatherConditions() {
        return weatherConditions;
    }
}
