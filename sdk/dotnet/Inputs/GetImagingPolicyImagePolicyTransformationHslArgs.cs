// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetImagingPolicyImagePolicyTransformationHslInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("hue")]
        public Input<string>? Hue { get; set; }

        [Input("hueVar")]
        public Input<string>? HueVar { get; set; }

        [Input("lightness")]
        public Input<string>? Lightness { get; set; }

        [Input("lightnessVar")]
        public Input<string>? LightnessVar { get; set; }

        [Input("saturation")]
        public Input<string>? Saturation { get; set; }

        [Input("saturationVar")]
        public Input<string>? SaturationVar { get; set; }

        public GetImagingPolicyImagePolicyTransformationHslInputArgs()
        {
        }
        public static new GetImagingPolicyImagePolicyTransformationHslInputArgs Empty => new GetImagingPolicyImagePolicyTransformationHslInputArgs();
    }
}