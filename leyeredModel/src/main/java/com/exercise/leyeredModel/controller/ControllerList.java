package com.exercise.leyeredModel.controller;
import com.exercise.leyeredModel.models.Post;
import com.exercise.leyeredModel.repository.IPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
public class ControllerList {
    //I need to use the method "getList" that I have in the repository layer in this controller layer. so I use @Autowired to get the interface IPostRepository, instantiate it, but only declaring it, not "assigning it"
    @Autowired//dependency injection using "interface"
    private IPostRepository repo; // instantiation of an object interface

    /*public ControllerList(IPostRepository repo) { // dependency injection using a "constructor", without the interface and the @Autowired
        this.repo = repo;
    }*/

    @GetMapping("/posts")
    @ResponseBody
    public List<Post> getAllPost(){
        return repo.getList();// this method is not implement it in the interface, but I have a class that is using or implementing that interface and overriding the method that I'm calling, so it will call that one instead!!!
    }
}



/*PostRepository posteo = new PostRepository();
        return posteo.getList();*/

/* this is the common way to use the methods implemented in another class,
we instantiate an object of the class and then with that "new object"
we can use its methods, but the problem is that we are using the creation
of new instantiations of objects in each request made by the user.
without respecting the dependency injection and the layer model,
what I really have to do is consult or call the interface that I create in the repository,
instantiate it but only declaring it (without assigning it or creating a "new"_ calling a constructor")
and using the @Autowire annotation from the controller,*/