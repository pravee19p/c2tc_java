import React from "react";
import { Link } from "react-router-dom";
import './Addcss.css';
import m1 from './images/m1.png';
import m4 from './images/m4.png'
function Shoppingmall(){
    return(
        <div>
        <div class="topcontainershop">
                 <div class="left"><p>SHOPPING MALL</p></div>
                 <div><Link to="/admin" class="right">ADMIN PAGE</Link></div> 
                </div>
            
                <div class="pimg"><p>From trendy shops to delicious dining. With ample parking and family-friendly 
                    amenities, enjoy a hassle-free shopping adventure filled with fun and excitement!</p></div>
                <div class="divimg" >
                    
                <img src={m4} alt="shop" title="Happy Shopping" />
                <img src={m1} alt="shop" title="Happy Shopping" />

                </div>
       
        
            </div>
        
            
         
            
       
    )

}export default Shoppingmall