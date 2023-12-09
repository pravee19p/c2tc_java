import React, { useState } from "react";
import axios from 'axios';
import './Addcss.css';
import  Nav from './Nav.js';


function Selectid() {
    const [id, setId] = useState("");
    const [posts, setPosts] = useState([]);

    const handleFetchUser = (e) => {
        e.preventDefault(); // Prevents form submission and page refresh
        axios.get(`http://localhost:8080/admins/${id}`)
            .then(res => {
                setPosts([res.data]); // Assuming the response data is an object
            })
            .catch(err => {
                console.log(err);
                // Handle error if the ID does not exist or other errors
            });
    };

    return (
        <div>
            <Nav/>
            <center>
                <div className="formcl">
                    <form>
                        <div className="con">
                            <label>ENTER ID</label>
                            <input
                                type="text"
                                placeholder="ENTER ID"
                                value={id}
                                onChange={(e) => setId(e.target.value)}
                            />
                            <button type="submit" onClick={handleFetchUser}>SELECT</button>
                        </div>
                    </form>
                 </div>
                    
                        {posts.map(post => (
                            <table>
                             <tr>
                             <th>ID</th>
                             <th>Name</th>
                             <th>Password</th>
                             <th>Mall</th>
                             <th>Phone</th>
                            </tr>
                             <tr key={post.id}>
                                <td>{post.id}</td>
                                <td>{post.name}</td>
                                <td>{post.password}</td>
                                <td>{post.mall}</td>
                                <td>{post.phone}</td>
                            </tr>
                            </table>
                        ))}
                   
                
            </center>
        </div>
    );
}

export default Selectid;
