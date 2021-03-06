package com.openclassrooms.magicgithub.api;

import com.openclassrooms.magicgithub.model.User;
import java.util.List;
import static com.openclassrooms.magicgithub.api.FakeApiServiceGenerator.generateUsers;

public class FakeApiService implements ApiService {

    private List<User> users = generateUsers(); // création liste users depuis la class User héritée elle même de la classe abstraire FakeApiService

    /**
     * Return a list of {@link User}
     * Those users must be generated by {@link FakeApiServiceGenerator}
     */
    @Override
    public List<User> getUsers() {
        // TODO: A modifier
        return users; // retourne la liste des users générés au préalable
    }

    /**
     * Generate a random {@link User} and add it {@link FakeApiService#users} list.
     * This user must be get from the {@link FakeApiServiceGenerator#FAKE_USERS_RANDOM} list.
     */
    @Override
    public void generateRandomUser() {
        users.add(User.random()); // fait appel à la méthode random dans users pour ajouter à la liste User un utilisateur aléatoirement ensuite on rajoute un élément à la liste users
    }

    /**
     * Delete a {@link User} from the {@link FakeApiService#users} list.
     */
    @Override
    public void deleteUser(User user) {
        // TODO: A modifier
        users.remove(user); // retirez de la liste un utilisateur depuis User dans la class FakeApiService (list) (via l'attribut users) passé en paramètre
    }
}
