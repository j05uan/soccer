package com.soccer;


import java.util.Hashtable;

import com.soccer.model.entity.Coach;
import com.soccer.model.entity.Player;
import com.soccer.model.entity.Team;

public class Controller {
    public Hashtable <String,Team> equipos = new Hashtable<>();
    public Hashtable <String,Player> jugadores = new Hashtable<>();
    public Hashtable <String,Coach> entrenadores = new Hashtable<>();


    public Hashtable<String, Team> getEquipos() {
        return equipos;
    }

    public Team getEquipoById(String key){
        return equipos.get(key);
    }

    public void setEquipos(String key,Team equipo) {
        this.equipos.put(key, equipo);
    }
    public Hashtable<String, Player> getJugadores() {
        return jugadores;
    }
    public void setJugadores(Hashtable<String, Player> jugadores) {
        this.jugadores = jugadores;
    }

    public Player getJugadoresById(String codigoJugador) {
        return jugadores.get(codigoJugador);
    }
    public void setEntrendadores(Hashtable<String, Coach> entrenadores) {
        this.entrenadores = entrenadores;
    }

    public Coach getEntrenadoresById(String codigoEntrenador) {
        return entrenadores.get(codigoEntrenador);
    }
    

}
