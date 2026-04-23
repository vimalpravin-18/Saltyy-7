//  -------------- Expense Tracker --------------

import { useState } from "react";

function App()  {
    const[expense , setExpense] = useState([])
    const[title, setTitle] = useState("")
    const[amount, setAmount] = useState("");

    function addExpense() {

    if(title.trim() == "" || amount == "") {
        alert("Enter valid data !")
        return;
    }

    const NewExpense = {
        id : Date.now(),
        title : title,
        amount : Number(amount)
    };

    setExpense([...expense, NewExpense])

    setTitle("")
    setAmount("")
    }

    function DeleteExpense(id) {
        const updated = expense.filter(e => e.id !== id) 
        setExpense(updated);
    }

    function getTotal() {
        return expense.reduce((total, e) => total + e.amount, 0); 
    }

    function handleKeyDown(e) {
        if(e.key = "Enter") {
            addExpense();
        }
    }

    return (
        <div style={{padding: "20px"}}>
                <h1>Expense Tracker</h1>

                <input 
                    type="text"
                    value={title}
                    placeholder="Description"
                    onChange={(e) => setTitle(e.target.value)} 
                    style={{padding: "20px"}, {marginTop : "10px"}}
                 /> <br />


                 <input
                    type="Number" 
                    value={amount}
                    placeholder="Enter amount"
                    onChange={(e) => setAmount(e.target.value)}
                    style={{padding: "20px"}, {marginTop : "10px"}}
                /> <br />

                <button onClick={handleKeyDown} style={{padding: "20px"}, {marginTop : "10px"}}>Add</button><br />
                <h2>Total : ${getTotal()}</h2>

                <ul>
                    {expense.map(e => (
                        <li key={e.id} >
                            {e.title} - ${e.amount}
                            <button onClick={() => DeleteExpense(e.id)} style={{marginLeft : "30px"}, {background: "red"}}>delete</button>
                        </li>
                    ))}
                </ul>
        </div>
    )
}

export default App;
