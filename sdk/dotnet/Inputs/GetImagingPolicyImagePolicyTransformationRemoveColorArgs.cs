// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetImagingPolicyImagePolicyTransformationRemoveColorInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("color")]
        public Input<string>? Color { get; set; }

        [Input("colorVar")]
        public Input<string>? ColorVar { get; set; }

        [Input("feather")]
        public Input<string>? Feather { get; set; }

        [Input("featherVar")]
        public Input<string>? FeatherVar { get; set; }

        [Input("tolerance")]
        public Input<string>? Tolerance { get; set; }

        [Input("toleranceVar")]
        public Input<string>? ToleranceVar { get; set; }

        public GetImagingPolicyImagePolicyTransformationRemoveColorInputArgs()
        {
        }
        public static new GetImagingPolicyImagePolicyTransformationRemoveColorInputArgs Empty => new GetImagingPolicyImagePolicyTransformationRemoveColorInputArgs();
    }
}
