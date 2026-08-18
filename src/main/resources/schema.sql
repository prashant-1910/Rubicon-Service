-- Create Students Table Script
-- Database: rubicon
-- User: rub_user

CREATE TABLE IF NOT EXISTS students (
    id SERIAL PRIMARY KEY,
    user_name VARCHAR(255) NOT NULL,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    address VARCHAR(500),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Create indexes for better query performance
CREATE INDEX IF NOT EXISTS idx_user_name ON students(user_name);
CREATE INDEX IF NOT EXISTS idx_first_name ON students(first_name);
CREATE INDEX IF NOT EXISTS idx_last_name ON students(last_name);

-- Add comment to table
COMMENT ON TABLE students IS 'Student information table';
COMMENT ON COLUMN students.id IS 'Unique student identifier';
COMMENT ON COLUMN students.user_name IS 'Student username';
COMMENT ON COLUMN students.first_name IS 'Student first name';
COMMENT ON COLUMN students.last_name IS 'Student last name';
COMMENT ON COLUMN students.address IS 'Student address';
