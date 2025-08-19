package com.forumhub.forumhub.domain.topico.dto;
import jakarta.validation.constraints.NotNull;
public record DadosAtualizacaoTopico(
        @NotNull
        Long id,
        String titulo,
        String mensagem
) {}
