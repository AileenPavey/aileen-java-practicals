
import os
import shutil

PENDING = "pending"
UPLOADED = "uploaded"

os.makedirs(UPLOADED, exist_ok=True)

files = sorted([
    f for f in os.listdir(PENDING)
    if f.endswith(".java")
])[:2]

readme_text = "\n# Daily Uploaded Java Practicals\n"

for file in files:

    src = os.path.join(PENDING, file)
    dst = os.path.join(UPLOADED, file)

    shutil.move(src, dst)

    title = file.replace(".java", "")

    description = f"Java practical demonstrating {title}."

    readme_text += f"\n## {title}\n"
    readme_text += f"{description}\n"

with open("README.md", "a", encoding="utf-8") as f:
    f.write(readme_text)

print("Uploaded:", files)
