
Pod::Spec.new do |s|
  s.name         = "RNReactBridgeTesting"
  s.version      = "1.0.0"
  s.summary      = "RNReactBridgeTesting"
  s.description  = <<-DESC
                  RNReactBridgeTesting
                   DESC
  s.homepage     = ""
  s.license      = "MIT"
  # s.license      = { :type => "MIT", :file => "FILE_LICENSE" }
  s.author             = { "author" => "author@domain.cn" }
  s.platform     = :ios, "7.0"
  s.source       = { :git => "https://github.com/author/RNReactBridgeTesting.git", :tag => "master" }
  s.source_files  = "RNReactBridgeTesting/**/*.{h,m}"
  s.requires_arc = true


  s.dependency "React"
  #s.dependency "others"

end

  