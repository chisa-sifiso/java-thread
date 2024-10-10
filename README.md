
<body>
    <h1>Java Thread Odds and Evens</h1>
    <p>This project demonstrates the use of multithreading in Java by creating separate threads to handle even and odd numbers. The application includes two threads: one for printing odd numbers and another for printing even numbers up to a specific limit.</p>
    <h2>Project Structure</h2>
    <ul>
        <li><strong>ThreadOdd</strong>: A thread class that extends <code>Thread</code> and prints odd numbers up to 10.</li>
        <li><strong>threatEven</strong>: A class that implements <code>Runnable</code> and prints even numbers up to 10.</li>
        <li><strong>ExpTh</strong>: The main class that initiates and starts the threads with different priorities.</li>
    </ul>

   <h2>Technologies Used</h2>
    <ul>
        <li>Java SE</li>
        <li>Multithreading using <code>Thread</code> and <code>Runnable</code> interfaces</li>
    </ul>

   <h2>How to Run</h2>
    <ol>
        <li>Clone the repository to your local machine:
            <pre><code>git clone https://github.com/your-username/java-thread-odds-evens.git</code></pre>
        </li>
        <li>Open the project in your Java IDE or code editor.</li>
        <li>Compile and run the <code>ExpTh</code> class.</li>
    </ol>
    <h2>Usage</h2>
    <ol>
        <li>The main thread starts by creating two threads: <code>ThreadOdd</code> and <code>threatEven</code>.</li>
        <li>The threads run concurrently, printing odd and even numbers respectively.</li>
        <li>Each thread sleeps for a short interval (1000 ms) to simulate a delay in processing.</li>
    </ol>
    <h2>Data Structure Usage</h2>
    <p>This application uses multithreading to manage the execution of tasks concurrently. The <strong>Thread</strong> class and the <strong>Runnable</strong> interface are used to create and manage separate threads that work together to print numbers based on their parity (odd or even). The use of threads allows the application to perform tasks asynchronously and manage CPU time efficiently.</p>

  <h2>Contributions</h2>
    <p>Feel free to fork this repository and submit pull requests. For major changes, please open an issue first to discuss what you would like to change.</p>

   <h2>License</h2>
    <p>This project is licensed under the MIT License.</p>
</body>
</html>
