// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetImagingPolicyImagePolicyTransformationMirrorArgs : global::Pulumi.InvokeArgs
    {
        [Input("horizontal")]
        public string? Horizontal { get; set; }

        [Input("horizontalVar")]
        public string? HorizontalVar { get; set; }

        [Input("vertical")]
        public string? Vertical { get; set; }

        [Input("verticalVar")]
        public string? VerticalVar { get; set; }

        public GetImagingPolicyImagePolicyTransformationMirrorArgs()
        {
        }
        public static new GetImagingPolicyImagePolicyTransformationMirrorArgs Empty => new GetImagingPolicyImagePolicyTransformationMirrorArgs();
    }
}
