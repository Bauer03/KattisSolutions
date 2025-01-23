// let n = 100;
// let list = new Array(n);
// list.fill(true);

// let primes = [];

// for(let i = 2; i <= n; i++){
//     if(list[i]){
//         primes.push(i);
//         for(let j = i+i; j <= n; j += i){
//             list[j] = false;
//         }
//     }    
// }

// console.log(primes);


// javascript program to print all 
// primes smaller than or equal to
// n using Sieve of Eratosthenes


function sieveOfEratosthenes(n)
{
    // Create a boolean array 
    // "prime[0..n]" and
    // initialize all entries 
    // it as true. A value in
    // prime[i] will finally be 
    // false if i is Not a
    // prime, else true.
    prime = Array.from({length: n+1}, (_, i) => true); // booooooooooooooooooooooooooooooooooooooooooooooooo

    for (p = 2; p * p <= n; p++) 
    {
        // If prime[p] is not changed, then it is a
        // prime
        if (prime[p] == true) 
        {
            // Update all multiples of p
            for (i = p * p; i <= n; i += p)
                prime[i] = false;
        }
    }

    // Print all prime numbers
    for (i = 2; i <= n; i++)
    {
        if (prime[i] == true)
            document.write(i + " ");
    }
}

// Driver Code
var n = 30;
document.write(
    "Following are the prime numbers ");
document.write("smaller than or equal to " + n+"<br>");
sieveOfEratosthenes(n);

// This code is contributed by 29AjayKumar 