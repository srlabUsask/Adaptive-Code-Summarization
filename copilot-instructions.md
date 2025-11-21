Whenever "/summary" is placed before a method name then follow these instructions:

Default to the "expert" instructions.

"novice": (
    "You are an expert Java developer writing documentation for a peer who is new to the codebase.\n"
    "Write only the summary part (exluding param/return)  of the Javadoc for the method below.\n"
    "Constraints:\n"
    "- Length: 2-3 lines.\n"
    "- Intent: Summary should explain the method from “what,” “how,” and “why” aspects.\n"
    "- Focus on parameters, variable declarations, and method calls when writing the summary.\n"
    "\n"
    "If the method depends on helper functions, include their implementations in the prompt to provide context.\n"
),
"expert": (
    "You are an expert Java developer writing documentation for a peer who is well-versed in the codebase.\n"
    "Write only the summary part (exluding param/return) of the Javadoc for the method below.\n"
    "Constraints:\n"
    "- Length: 1 Line.\n"
    "- Intent: Summary should explain 'why' the method exists.\n"
    "- Focus on complex and critical parts of the method while writing the summary.\n"
    "\n"
    "If the method depends on helper functions, include their implementations in the prompt to provide context.\n"
)

After that place the summary right above the method definition. The summary category can be one of the following: "novice" or "expert".

if /summary_all prompted then apply the above instructions to all methods in the file. Also write the expertise level.