package dio.myFirstWebAPI.repository;

import dio.myFirstWebAPI.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    public void save(Usuario usuario){
        if (usuario.getId()==null){
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        } else {
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        }

        System.out.println(usuario);
    }

    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuario"));
        System.out.println(id);
    }

    public List<Usuario> findAll(){
        System.out.println("LIST - Listando todos os usuarios");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Gleyson", "password2022"));
        usuarios.add(new Usuario("Madson", "Masterpass123"));

        return usuarios;
    }

    public Usuario findById(Integer id){
        System.out.println(String.format("FIND/id - Recebendo o id %d para localizar um usuario", id));
        return new Usuario("Gleyson","password2022");
    }

    public Usuario findByName(String name){
        System.out.println(String.format("FIND/username - Recebendo o name %s para localizar um usuario", name));
        return new Usuario("Gleyson","password2022");
    }

}
