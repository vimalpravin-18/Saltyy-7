//  ----------- Count Inc and dec ------------




// import { useState } from "react";

// function Counter() {
//   const[count, setCount] = useState(0)

//   return (
//     <div>
//       <h1>{count}</h1>

//       <button onClick={() => setCount(count + 1)}>+</button>
//       <button onClick={() => setCount(count - 1)}>-</button>
//     </div>
//   );
// }
// export default Counter;







//  ------------------ To Do App -------------------

// import { useState } from "react";

// function App() {
//     const[tasks, setTask] = useState([])
//     const[input , setInput] = useState(" ")

//     function addtask() {
//       if(input == "") return;
//       setTask([...tasks, input])
//       setInput("")
//     }

//     function deleteTask(index) {
//       const newTask = tasks.filter((_, i) => i !== index);
//       setTask(newTask);
//     }

//     return (

//       <div>

//         <h1>To DO App</h1>
//         <input
//             value={input}
//             onChange={(e) => setInput(e.target.value)}
//         />

//         <button onClick={addtask}>Add</button>

//         <ul>
//           {tasks.map((task, index) => (
//             <li key={index}>
//               {task}
//               <button onClick={() => deleteTask(index)}>Delete</button>
//             </li>
//           ))}
//         </ul>
//       </div>
//     );
// }

// export default App;






// --------- Student Management System ------------------   ( connected the react with spring boot )
//                                                          ( worked with spring boot backend to store data in spring store)

// import { useEffect, useState } from "react";

// function App() {
//   const [students, setStudents] = useState([]);
//   const [name, setName] = useState("");
//   const [mark, setMark] = useState("");

//   useEffect(() => {
//     loadStudents();
//   }, []);

//   function loadStudents() {
//     fetch("http://localhost:8081/students")
//       .then((res) => res.json())
//       .then((data) => setStudents(data))
//       .catch((err) => console.error("Error", err));
//   }

//   function addStudent() {
//     if (name.trim() == "" || mark == "") {
//       alert("Enter valid data !");
//       return;
//     }

//     fetch("http://localhost:8081/students", {
//       method: "POST",
//       headers: {
//         "Content-Type": "application/json",
//       },
//       body: JSON.stringify({
//         name: name,
//         mark: Number(mark),
//       }),
//     })
//       .then(() => {
//         setName("");
//         setMark("");
//         loadStudents();
//       })
//       .catch((err) => console.error("Error", err));
//   }

//   function deleteStudent(id) {
//     fetch(`http://localhost:8081/students/${id}`, {
//       method: "DELETE",
//     })
//       .then(() => loadStudents())
//       .catch((err) => console.error("Error", err));
//   }

//   return (
//     <div style={{ padding: "20px" }}>
//       <h1>Student Management System</h1>
//       <input
//         type="text"
//         value={name}
//         onChange={(e) => setName(e.target.value)}
//         placeholder="Name"
//       />

//       <input
//         type="number"
//         value={mark}
//         onChange={(e) => setMark(e.target.value)}
//         placeholder="Mark"
//       />

//       <button onClick={addStudent}>Add</button>

//       <ul>
//         {students.map((s) => (
//           <li key={s.id}>
//             {s.name} - {s.mark};
//             <button onClick={() => deleteStudent(s.id)}>delete</button>
//           </li>
//         ))}
//       </ul>
//     </div>
//   );
// }
// export default App;
