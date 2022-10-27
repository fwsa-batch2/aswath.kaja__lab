books = ["Design as Art", "Anathem", "Shogun"]
authors = ["Bruno Munari", "Neal Stephenson", "James Clavell"]

for i in 0...books.length do
    for j in 0...authors.length do
        if i==j
             p "#{books[i]} was written by #{authors[j]}"
        end
    end
end