package br.com.estudo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.estudo.Nasa.Nasa;

public interface NasaRepository extends JpaRepository<Nasa, Integer> {}