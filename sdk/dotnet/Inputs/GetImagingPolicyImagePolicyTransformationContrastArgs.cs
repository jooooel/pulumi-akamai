// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetImagingPolicyImagePolicyTransformationContrastInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("brightness")]
        public Input<string>? Brightness { get; set; }

        [Input("brightnessVar")]
        public Input<string>? BrightnessVar { get; set; }

        [Input("contrast")]
        public Input<string>? Contrast { get; set; }

        [Input("contrastVar")]
        public Input<string>? ContrastVar { get; set; }

        public GetImagingPolicyImagePolicyTransformationContrastInputArgs()
        {
        }
        public static new GetImagingPolicyImagePolicyTransformationContrastInputArgs Empty => new GetImagingPolicyImagePolicyTransformationContrastInputArgs();
    }
}