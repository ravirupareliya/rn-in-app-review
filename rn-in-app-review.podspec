require "json"

package = JSON.parse(File.read(File.join(__dir__, "package.json")))

Pod::Spec.new do |s|
  s.name         = package['name']
  s.version      = package["version"]
  s.summary      = package["description"]
  s.homepage     = package['homepage']
  # brief license entry:
  s.license      = package['license']
  # optional - use expanded license entry instead:
  # s.license    = { :type => "MIT", :file => "LICENSE" }
  s.authors      = package['author']
  s.platforms    = { :ios => "9.0" }
  s.source       = { :git => "https://github.com/ravirupareliya/rn-in-app-review.git", :tag => "#{s.version}" }

  s.source_files = "ios/**/*.{h,c,m,swift}"

  s.dependency "React"
  # ...
  # s.dependency "..."
end

