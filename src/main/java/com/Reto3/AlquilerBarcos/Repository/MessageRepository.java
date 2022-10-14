package com.Reto3.AlquilerBarcos.Repository;

import com.Reto3.AlquilerBarcos.Crud.MessageCrudRepository;
import com.Reto3.AlquilerBarcos.modelo.Message;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class MessageRepository {
    
    @Autowired
    private MessageCrudRepository messageCrudRepository;
    
    public List<Message> getAll(){
        return (List<Message>) messageCrudRepository.findAll();
    }
    
    public Optional<Message> getMessage(int id){
        return messageCrudRepository.findById(id);
    }
    
    public Message save (Message message){
        return messageCrudRepository.save(message);
    }
    
    public void delete (Message message){
        messageCrudRepository.delete(message);
    }
    
}
