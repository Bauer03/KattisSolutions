use std::io;

fn main() {
    let mut input = String::new();
    io::stdin().read_line(&mut input).unwrap();
    let mut chars = input.chars(); // make an iterator
    let mut initials = String::new();
    initials.push(chars.next().unwrap()); // get first initial, add to the output

    while let Some(c) = chars.next() {
        if c == '-' {
            initials.push(chars.next().unwrap());
        }
    }
    println!("{}",initials);
}