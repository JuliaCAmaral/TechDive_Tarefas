package dive.tech.projeto.exercicios.controller;

import dive.tech.projeto.exercicios.entity.Curso;
import dive.tech.projeto.exercicios.service.CursoService;
import org.apache.commons.lang3.StringUtils;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/curso")
@ApplicationScoped
public class CursoController {

    CursoService service = new CursoService();

    @GET
    @Produces("application/json")
    public Response listarCursos() {
        List<Curso> cursos = service.obterCursos();
        return Response
                .ok(cursos)
                .build();
    }

    @GET
    @Path("/filtro")
    @Produces("application/json")
    public Response filtrarCursos(@QueryParam("nome") String nome) {
        try {
            List<Curso> cursos = service.getByName(nome);
            return Response
                    .ok(cursos)
                    .build();
        } catch (Exception e) {
            return Response
                    .ok(e.getMessage())
                    .status(Response.Status.NOT_FOUND)
                    .build();
        }
    }

    @GET
    @Path("/{id}")
    @Produces("application/json")
    public Response getCurso(@PathParam("id") Long id) {
        try {
            Curso curso = service.getById(id);
            return Response
                    .ok(curso)
                    .build();
        } catch (Exception e) {
            return Response
                    .ok(e.getMessage())
                    .status(Response.Status.NOT_FOUND)
                    .build();
        }
    }

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public Response criarCurso(Curso curso, @HeaderParam("Authorization") String authorization) {
        if (StringUtils.isBlank(authorization) || !"senha123".equals(authorization)) {
            return Response
                    .status(Response.Status.FORBIDDEN)
                    .build();
        }
        try {
            service.criarCurso(curso);
            return Response
                    .ok(curso)
                    .status(Response.Status.CREATED)
                    .build();
        } catch (Exception e) {
            return Response
                    .ok(e.getMessage())
                    .build();
        }
    }

    @PUT
    @Consumes("application/json")
    @Produces("application/json")
    public Response editarCurso(Curso curso) {
        try {
            service.editarCurso(curso);
            return Response
                    .ok(curso)
                    .build();
        } catch (Exception e) {
            return Response
                    .ok(e.getMessage())
                    .build();
        }
    }

    @DELETE
    @Path("{id}")
    @Produces("application/json")
    public Response deletarCurso(@PathParam("id") Long id) {
        try {
            service.deletarCurso(id);
            List<Curso> cursos = service.obterCursos();
            return Response
                    .ok(cursos)
                    .build();
        } catch (Exception e) {
            return Response
                    .ok(e.getMessage())
                    .status(Response.Status.BAD_REQUEST)
                    .build();
        }
    }
}
