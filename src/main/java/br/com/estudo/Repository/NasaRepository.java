package br.com.estudo.Repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import br.com.estudo.Nasa.Nasa;

@Repository
@Component
@Qualifier("NasaRepository")
public interface NasaRepository extends JpaRepository<Nasa, Integer> {}