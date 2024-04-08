package com.exercise.leyeredModel.repository;
import com.exercise.leyeredModel.models.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

//act like a database where we can create objects of type Post
@Repository
public class PostRepository implements IPostRepository {

    @Override // this is going to work first
    public List<Post> getList() {
        List <Post> postList = new ArrayList<>();
        postList.add(new Post(89, "The life is beautiful", "Emiliana"));
        postList.add(new Post(80, "The life is wonderful", "Maria"));

        return postList;
    }
}



/* public List<Post> getList (){ // // this is the common way to use the methods implemented in another class, we instantiate an object of the class and then with that "new object" we can use its methods, but the problem is that we are using the creation of new instantiations of objects in each request made by the user. without respecting the dependency injection and the layer model, what I really have to do is consult or call the interface that I create in the repository, instantiate it but only declaring it (without assigning it or creating a new new...) and using the @Autowire annotation from the controller,
        List <Post> postList = new ArrayList<>();
        postList.add(new Post(89, "The life is beautiful", "Emiliana"));
        postList.add(new Post(80, "The life is wonderful", "Maria"));

        return postList;
    }*/