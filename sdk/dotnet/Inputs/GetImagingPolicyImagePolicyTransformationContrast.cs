// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetImagingPolicyImagePolicyTransformationContrastArgs : global::Pulumi.InvokeArgs
    {
        [Input("brightness")]
        public string? Brightness { get; set; }

        [Input("brightnessVar")]
        public string? BrightnessVar { get; set; }

        [Input("contrast")]
        public string? Contrast { get; set; }

        [Input("contrastVar")]
        public string? ContrastVar { get; set; }

        public GetImagingPolicyImagePolicyTransformationContrastArgs()
        {
        }
        public static new GetImagingPolicyImagePolicyTransformationContrastArgs Empty => new GetImagingPolicyImagePolicyTransformationContrastArgs();
    }
}