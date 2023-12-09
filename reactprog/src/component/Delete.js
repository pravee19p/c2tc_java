import React, { useState } from "react";
import axios from 'axios';
import  Nav from './Nav.js';



function Delete()
{           
    const [idToDelete, setIdToDelete] = useState("");

    const handleDelete = () => {
        axios.delete(`http://localhost:8080/admins/${idToDelete}`)
            .then(res => {
                
                console.log(res);
                // Handle successful deletion or perform necessary actions
            })
            .catch(err => {
                console.log(err);
                // Handle error if deletion fails
            });
    };

    return(
        <div>
            <Nav/>
           
        <div class="formdel">
            <center>
            <form >
                <div class="condel">
                <label>ENTER ID</label>
                <input type="text" placeholder="ENTER ID"
                 value={idToDelete}
                 onChange={(e) => setIdToDelete(e.target.value)}/>
                <button type="submit" onClick={handleDelete}>DELETE</button>
                </div>
            </form>
            </center>
            </div>
        </div>
       
    )
}export default Delete